import React, {useEffect} from "react";
import MenuIcon from "@mui/icons-material/Menu";
import {Badge, Drawer, IconButton, Button} from "@mui/material";
import {useNavigate} from "react-router-dom";
import {NotificationsActive} from "@mui/icons-material";
import {useDispatch, useSelector} from "react-redux";
import {fetchNotificationsBySalon} from "../../../Redux/Notifications/action";
import useNotificationWebsoket from "../../../util/useNotificationWebsoket";

const Navbar = ({DrawerList}) => {
    const navigate = useNavigate();
    const [open, setOpen] = React.useState(false);
    const {notification, salon} = useSelector((store) => store);
    const dispatch = useDispatch();

    const toggleDrawer = (newOpen) => () => {
        setOpen(newOpen);
    };

    useEffect(() => {
        if (salon.salon?.id) {
            dispatch(
                fetchNotificationsBySalon({
                    salonId: salon.salon.id,
                    jwt: localStorage.getItem("jwt"),
                })
            );
        }
    }, [salon.salon?.id, dispatch]);

    useNotificationWebsoket(salon.salon?.id, "salon");

    return (
        <div className="h-[10vh] flex items-center justify-between px-5 border-b">
            <div className="flex items-center gap-3 ">
                <IconButton onClick={toggleDrawer(true)} color="primary">
                    <MenuIcon color="primary" />
                </IconButton>

                <h1 onClick={() => navigate("/")} className="logo text-xl cursor-pointer">
                    Salon Booking
                </h1>
            </div>

            <div className="flex items-center gap-6">
                {/* Home Button */}
                <Button variant="outlined" color="primary" onClick={() => navigate("/")}>
                    Home
                </Button>

                {/* Notifications */}
                <IconButton onClick={() => navigate("/salon-dashboard/notifications")}>
                    <Badge badgeContent={notification.notifications.length} color="secondary">
                        <NotificationsActive color="primary" />
                    </Badge>
                </IconButton>
            </div>

            <Drawer open={open} onClose={toggleDrawer(false)}>
                <DrawerList toggleDrawer={toggleDrawer} />
            </Drawer>
        </div>
    );
};

export default Navbar;
