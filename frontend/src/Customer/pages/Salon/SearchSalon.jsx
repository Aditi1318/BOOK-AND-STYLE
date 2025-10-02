import React, {useState} from "react";
import SalonList from "./SalonList";
import {useDispatch, useSelector} from "react-redux";
import {searchSalon} from "../../../Redux/Salon/action";

const SearchSalon = () => {
    const {salon} = useSelector((store) => store);
    const dispatch = useDispatch();
    const [searchValue, setSearchValue] = useState("");

    const handleSearch = (e) => {
        setSearchValue(e.target.value);
        dispatch(searchSalon({jwt: localStorage.getItem("jwt"), city: e.target.value}));
    };

    return (
        <div className="relative w-full min-h-screen">
            {/* Fullscreen video background */}
            <video
                className="absolute top-0 left-0 w-full h-full object-cover"
                autoPlay
                muted
                loop
                src="https://booksy-public.s3.amazonaws.com/horizontal_.webm"
            />

            {/* Overlay to darken video */}
            <div className="absolute top-0 left-0 w-full h-full bg-black opacity-60 z-10"></div>

            {/* Search Input + Content */}
            <div className="relative z-20 flex flex-col items-center justify-center min-h-screen space-y-4 px-5">
                <h1 className="text-5xl font-bold text-white text-center">Discover Salons Near You</h1>
                <input
                    value={searchValue}
                    onChange={handleSearch}
                    className="
            border border-gray-300
            bg-white
            rounded-md
            py-4
            w-[15rem] md:w-[33rem]
            outline-none
            text-gray-800
            placeholder-gray-400
            caret-white
            focus:ring-2 focus:ring-blue-500
            transition-colors
          "
                    placeholder="  Search salon by city..."
                />
            </div>

            {/* Salon List */}
            <div className="relative z-20 mt-10 px-5">
                <SalonList salons={salon.searchSalons} />
            </div>
        </div>
    );
};

export default SearchSalon;
