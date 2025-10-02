import React from "react";
import {Facebook, Twitter, Instagram, Linkedin} from "lucide-react";
const Footer = () => {
    return (
        <footer class="bg-gray-900 text-gray-200 py-10 flex flex-col items-center justify-center p-20">
            <div class="container mx-auto grid grid-cols-1 md:grid-cols-3 gap-8 px-6 md:px-0">
                <div>
                    <h3 class="text-xl font-semibold mb-4">About Us</h3>
                    <p class="text-sm">
                        Welcome to Book & Style, your one-stop destination for premium salon services. Book appointments
                        with ease and experience luxury at your fingertips.
                    </p>
                </div>

                {/* <div>
                    <h3 class="text-xl font-semibold mb-4">Quick Links</h3>
                    <ul class="space-y-2 text-sm">
                        <li>
                            <a href="/" class="hover:text-gray-400">
                                Home
                            </a>
                        </li>
                        <li>
                            <a href="/" class="hover:text-gray-400">
                                Services
                            </a>
                        </li>
                        <li>
                            <a href="/" class="hover:text-gray-400">
                                Book Appointment
                            </a>
                        </li>
                        <li>
                            <a href="/" class="hover:text-gray-400">
                                About Us
                            </a>
                        </li>
                        <li>
                            <a href="/" class="hover:text-gray-400">
                                Contact
                            </a>
                        </li>
                    </ul>
                </div> */}

                <div class="md:col-span-2 text-right">
                    <h3 class="text-xl font-semibold mb-4">Contact Us</h3>
                    <ul class="space-y-2 text-sm">
                        <li>
                            <i class="fas fa-phone-alt"></i> +91 9113197825
                        </li>
                        <li>
                            <i class="fas fa-envelope"></i> support@salon.com
                        </li>
                        <li>
                            <i class="fas fa-map-marker-alt"></i> 123 Salon Street, Raipur, India
                        </li>
                    </ul>
                    <div className="mt-4 flex space-x-4 justify-end">
                        <a href="https://www.twitter.com" className="text-gray-400 hover:text-gray-200">
                            <Twitter className="h-5 w-5" />
                        </a>
                        <a href="https://www.instagram.com/Aditisi1318" className="text-gray-400 hover:text-gray-200">
                            <Instagram className="h-5 w-5" />
                        </a>
                        <a
                            href="https://www.linkedin.com/in/aditi-diwakar"
                            className="text-gray-400 hover:text-gray-200"
                        >
                            <Linkedin className="h-5 w-5" />
                        </a>
                    </div>
                </div>
            </div>

            <div class="border-t border-gray-700 mt-8 pt-4 text-center text-sm">
                &copy; 2025 Book & Style. All Rights Reserved.
            </div>
        </footer>
    );
};

export default Footer;
