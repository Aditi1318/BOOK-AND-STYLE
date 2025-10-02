import React, {useEffect} from "react";
import Banner from "./Banner";
import SalonList from "../Salon/SalonList";
import {useDispatch, useSelector} from "react-redux";
import {fetchSalons} from "../../../Redux/Salon/action";
import {services} from "../../../Data/Services"; // Make sure this is an array of plain objects
import HomeServiceCard from "./HomeServiceCard";

const Home = () => {
    const {salon} = useSelector((store) => store);
    const dispatch = useDispatch();

    useEffect(() => {
        dispatch(fetchSalons());
    }, [dispatch]);

    return (
        <div className="space-y-20">
            {/* Hero Banner */}
            <section>
                <Banner />
            </section>

            {/* Services Section and images grid*/}
            <section className="px-5 lg:px-20 lg:flex lg:items-start lg:gap-10">
                {/* Services Column */}
                <div className="w-full lg:w-1/2">
                    <h1 className="text-2xl font-semibold pb-6 text-center lg:text-left">
                        What are you looking for, Bestie? 👀
                    </h1>
                    <div className="flex flex-wrap justify-center lg:justify-start items-center gap-5">
                        {services.map((item) => (
                            <div
                                key={item.id}
                                className="transition-transform duration-300 hover:scale-105 hover:shadow-[0_0_30px_rgba(144,238,144,0.8)] rounded-xl"
                            >
                                <HomeServiceCard item={item} />
                            </div>
                        ))}
                    </div>
                </div>

                {/* Image Grid Column */}
                <div className="w-full lg:w-1/2 grid gap-3 grid-cols-2 grid-rows-12 h-[45vh] md:h-[90vh] mt-10 lg:mt-0">
                    {[
                        "https://images.pexels.com/photos/3998415/pexels-photo-3998415.jpeg?auto=compress&cs=tinysrgb&w=600",
                        "https://images.pexels.com/photos/3331488/pexels-photo-3331488.jpeg?auto=compress&cs=tinysrgb&w=600",
                        "https://images.pexels.com/photos/5069455/pexels-photo-5069455.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                        "https://images.pexels.com/photos/3757952/pexels-photo-3757952.jpeg?auto=compress&cs=tinysrgb&w=600",
                    ].map((src, index) => (
                        <div
                            key={index}
                            className={`${
                                index % 2 === 0 ? "row-span-7" : "row-span-5"
                            } group relative rounded-md transition-all duration-500 hover:scale-105 hover:shadow-[0_0_30px_rgba(144,238,144,0.8)] overflow-hidden`}
                        >
                            <img className="h-full w-full object-cover rounded-md" src={src} alt={`salon-${index}`} />
                        </div>
                    ))}
                </div>
            </section>

            {/* Salon List */}
            <section className="px-20">
                <h1 className="text-3xl font-bold pb-10">Book Your Favorite Salon 💇‍♀️✨</h1>
                <SalonList salons={salon.salons} />
            </section>
        </div>
    );
};

export default Home;
