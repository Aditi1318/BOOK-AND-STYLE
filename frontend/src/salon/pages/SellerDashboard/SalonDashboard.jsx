import React, {useEffect} from "react";

import Navbar from "../../../admin seller/components/navbar/Navbar";
import SalonRoutes from "../../../routes/SalonRoutes";
import {useDispatch} from "react-redux";
import {fetchSalonByOwner} from "../../../Redux/Salon/action";
import SalonDrawerList from "../../components/SideBar/DrawerList";
import {getSalonReport} from "../../../Redux/Booking/action";
import Footer from "../../../Customer/pages/Footer/Footer";

const SalonDashboard = () => {
    const dispatch = useDispatch();

    useEffect(() => {
        dispatch(fetchSalonByOwner(localStorage.getItem("jwt")));
        dispatch(getSalonReport(localStorage.getItem("jwt")));
    }, [dispatch]);

    return (
        <div className="min-h-screen flex flex-col">
            {/* Navbar */}
            <Navbar DrawerList={SalonDrawerList} />

            {/* Main Content */}
            <section className="lg:flex lg:h-[90vh] flex-1">
                <div className="hidden lg:block h-full">
                    <SalonDrawerList />
                </div>
                <div className="p-10 w-full lg:w-[80%] overflow-y-auto">
                    <SalonRoutes />
                </div>
            </section>

            {/* Footer */}
            <Footer />
        </div>
    );
};

export default SalonDashboard;
