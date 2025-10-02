import React from "react";
import {Twitter, Instagram, Linkedin} from "lucide-react";

const Footer = () => {
    return (
        <footer className="bg-gray-900 text-gray-200 py-10 px-6">
            <div className="container mx-auto grid grid-cols-1 md:grid-cols-3 gap-10">
                {/* About Us */}
                <div className="text-center md:text-left">
                    <h3 className="text-xl font-semibold mb-4">About Us</h3>
                    <p className="text-sm leading-relaxed">
                        Welcome to Book & Style, your one-stop destination for premium salon services. Book appointments
                        with ease and experience luxury at your fingertips.
                    </p>
                </div>

                {/* Contact Us */}
                <div className="md:col-span-2 text-center md:text-right">
                    <h3 className="text-xl font-semibold mb-4">Contact Us</h3>
                    <ul className="space-y-2 text-sm">
                        <li>📞 +91 9113197825</li>
                        <li>📧 support@salon.com</li>
                        <li>📍 123 Salon Street, Raipur, India</li>
                    </ul>
                    <div className="mt-4 flex justify-center md:justify-end space-x-5">
                        <a href="https://www.twitter.com" className="text-gray-400 hover:text-white transition">
                            <Twitter className="h-5 w-5" />
                        </a>
                        <a
                            href="https://www.instagram.com/Aditisi1318"
                            className="text-gray-400 hover:text-white transition"
                        >
                            <Instagram className="h-5 w-5" />
                        </a>
                        <a
                            href="https://www.linkedin.com/in/aditi-diwakar"
                            className="text-gray-400 hover:text-white transition"
                        >
                            <Linkedin className="h-5 w-5" />
                        </a>
                    </div>
                </div>
            </div>

            {/* Bottom Section */}
            <div className="border-t border-gray-700 mt-8 pt-4 text-center text-xs md:text-sm text-gray-400">
                &copy; {new Date().getFullYear()} Book & Style. All Rights Reserved.
            </div>
        </footer>
    );
};

export default Footer;
