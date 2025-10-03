import React from "react";
import SalonCard from "./SalonCard";

const SalonList = ({salons}) => {
    return (
        <div className="flex gap-6 flex-wrap">
            {salons?.map((item) => (
                <div
                    key={item.id}
                    className="transition-transform duration-300 hover:scale-105 hover:shadow-[0_0_30px_rgba(144,238,144,0.8)] rounded-xl"
                >
                    <SalonCard salon={item} />
                </div>
            ))}
        </div>
    );
};

export default SalonList;
