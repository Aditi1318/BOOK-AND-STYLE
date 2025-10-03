import {
    Avatar,
    Badge,
    Button,
    Drawer,
    IconButton,
    List,
    ListItem,
    ListItemButton,
    ListItemText,
    Menu,
    MenuItem,
} from "@mui/material";
import React, {useEffect, useState} from "react";
import SearchIcon from "@mui/icons-material/Search";
import MenuIcon from "@mui/icons-material/Menu";
import CloseIcon from "@mui/icons-material/Close";
import AccountCircleIcon from "@mui/icons-material/AccountCircle";
import NotificationsActiveIcon from "@mui/icons-material/NotificationsActive";
import {useNavigate} from "react-router-dom";
import {useDispatch, useSelector} from "react-redux";
import {logout} from "../../../Redux/Auth/action";
import {fetchNotificationsByUser} from "../../../Redux/Notifications/action";
import useNotificationWebsoket from "../../../util/useNotificationWebsoket";
import {useTheme} from "@emotion/react";

const Navbar = () => {
    const navigate = useNavigate();
    const {auth, notification} = useSelector((store) => store);
    const dispatch = useDispatch();
    const theme = useTheme();

    const [anchorEl, setAnchorEl] = useState(null);
    const open = Boolean(anchorEl);

    const [drawerOpen, setDrawerOpen] = useState(false);

    const handleClick = (event) => {
        setAnchorEl(event.currentTarget);
    };
    const handleClose = () => {
        setAnchorEl(null);
    };

    const handleMenuClick = (path) => () => {
        if (path === "/logout") {
            dispatch(logout());
            navigate("/");
            handleClose();
            return;
        }
        navigate(path);
        handleClose();
    };

    useEffect(() => {
        if (auth.user?.id) {
            dispatch(
                fetchNotificationsByUser({
                    userId: auth.user.id,
                    jwt: localStorage.getItem("jwt"),
                })
            );
        }
    }, [auth.user]);

    useNotificationWebsoket(auth.user?.id, "user");

    const menuItems = [
        {label: "Home", path: "/"},
        {label: "Become Partner", path: "/become-partner"},
    ];

    return (
        <div className="z-50 px-6 flex items-center justify-between py-3 fixed top-0 left-0 right-0 bg-white shadow-md">
            {/* Left Section */}
            <div className="flex items-center gap-3">
                <h1
                    onClick={() => navigate("/")}
                    className="cursor-pointer font-bold text-xl lg:text-2xl text-primary-color"
                >
                    Salon Service
                </h1>

                {/* Desktop Menu */}
                <div className="hidden md:flex items-center gap-6 ml-8">
                    {menuItems.map((item, i) => (
                        <h1
                            key={i}
                            className="cursor-pointer hover:text-primary-color transition-colors duration-200"
                            onClick={() => navigate(item.path)}
                        >
                            {item.label}
                        </h1>
                    ))}
                </div>
            </div>

            {/* Right Section */}
            <div className="flex items-center gap-3 md:gap-6">
                {/* Notifications */}
                <IconButton onClick={() => navigate("/notifications")}>
                    <Badge badgeContent={notification.unreadCount} color="secondary">
                        <NotificationsActiveIcon color="primary" />
                    </Badge>
                </IconButton>

                {/* User Menu */}
                {auth.user?.id ? (
                    <div className="flex gap-1 items-center">
                        <h1 className="text-base font-semibold hidden lg:block">{auth.user?.fullName}</h1>
                        <IconButton
                            id="basic-button"
                            aria-controls={open ? "basic-menu" : undefined}
                            aria-haspopup="true"
                            aria-expanded={open ? "true" : undefined}
                            onClick={handleClick}
                        >
                            <Avatar sx={{bgcolor: theme.palette.primary.main}}>
                                {auth.user?.fullName && auth.user?.fullName[0].toUpperCase()}
                            </Avatar>
                        </IconButton>
                        <Menu
                            id="basic-menu"
                            anchorEl={anchorEl}
                            open={open}
                            onClose={handleClose}
                            MenuListProps={{"aria-labelledby": "basic-button"}}
                        >
                            <MenuItem onClick={handleMenuClick("/bookings")}>My Bookings</MenuItem>
                            {auth.user?.role === "SALON_OWNER" && (
                                <MenuItem onClick={handleMenuClick("/salon-dashboard")}>Dashboard</MenuItem>
                            )}
                            <MenuItem onClick={handleMenuClick("/logout")}>Logout</MenuItem>
                        </Menu>
                    </div>
                ) : (
                    <IconButton onClick={() => navigate("/login")}>
                        <AccountCircleIcon sx={{fontSize: "40px", color: theme.palette.primary.main}} />
                    </IconButton>
                )}

                {/* Mobile Menu Button */}
                <div className="md:hidden">
                    <IconButton onClick={() => setDrawerOpen(true)}>
                        <MenuIcon />
                    </IconButton>
                </div>
            </div>

            {/* Mobile Drawer */}
            <Drawer anchor="right" open={drawerOpen} onClose={() => setDrawerOpen(false)}>
                <div className="w-64 p-4 flex flex-col gap-6">
                    <div className="flex justify-between items-center">
                        <h2 className="font-bold text-lg">Menu</h2>
                        <IconButton onClick={() => setDrawerOpen(false)}>
                            <CloseIcon />
                        </IconButton>
                    </div>
                    <List>
                        {menuItems.map((item, i) => (
                            <ListItem key={i} disablePadding>
                                <ListItemButton
                                    onClick={() => {
                                        navigate(item.path);
                                        setDrawerOpen(false);
                                    }}
                                >
                                    <ListItemText primary={item.label} />
                                </ListItemButton>
                            </ListItem>
                        ))}
                        {auth.user?.id && (
                            <ListItem disablePadding>
                                <ListItemButton
                                    onClick={() => {
                                        navigate("/bookings");
                                        setDrawerOpen(false);
                                    }}
                                >
                                    <ListItemText primary="My Bookings" />
                                </ListItemButton>
                            </ListItem>
                        )}
                    </List>
                </div>
            </Drawer>
        </div>
    );
};

export default Navbar;
