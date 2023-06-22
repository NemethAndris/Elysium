import React from 'react';
import { Route, Routes } from 'react-router-dom';
import Landing from './Landing';
import Login from './Login';
import UserProfile from './UserProfile';
import ErrorPage from './ErrorPage';
import Navbar from './Navbar';
import RegisterAsJobSeeker from "./RegisterAsJobSeeker";
import RegisterAsEmployer from "./RegisterAsEmployer";

const Layout = () => {
    return (
        <div>
            <Navbar />
            <div className="container mx-auto">
                <Routes>
                    <Route path="/" element={<Landing />} />
                    <Route path="/register-jobSeeker" element={<RegisterAsJobSeeker />} />
                    <Route path="/register-employer" element={<RegisterAsEmployer />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/profile" element={<UserProfile />} />
                    <Route element={<ErrorPage />} />
                </Routes>
            </div>
        </div>
    );
};

export default Layout;