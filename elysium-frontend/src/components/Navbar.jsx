import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => {
    return (
        <nav className="bg-gray-800">
            <ul className="flex items-center justify-between py-4 px-8">
                <li>
                    <Link to="/" className="text-white hover:text-gray-300">
                        Home
                    </Link>
                </li>
                <li className="space-x-4">
                    <Link to="/register" className="text-white hover:text-gray-300">
                        Register
                    </Link>
                    <Link to="/login" className="text-white hover:text-gray-300">
                        Login
                    </Link>
                    <Link to="/profile" className="text-white hover:text-gray-300">
                        Profile
                    </Link>
                </li>
            </ul>
        </nav>
    );
};

export default Navbar;