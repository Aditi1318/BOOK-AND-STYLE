import React from "react";

const HomeServiceCard = ({item}) => {
    return (
        <div className="flex justify-center items-center flex-col gap-4 rounded-lg p-5 bg-slate-100 w-44 h-60 shadow-md">
            <img className="w-28 h-28 rounded-full object-cover" src={item.image} alt={item.name} />
            <h1 className="text-center font-medium text-lg">{item.name}</h1>
        </div>
    );
};

export default HomeServiceCard;
