import React from 'react';
import { Route, Routes } from 'react-router-dom'
import Landing from './Landing';
import Register from './Register';
import Login from './Login';
import UserProfile from './UserProfile';
import ErrorPage from './ErrorPage';
import Navbar from './Navbar';

function Layout() {
    return (
        <div>
            <Navbar />
            <Routes>
                <Route path='/' element={<Landing/>} />
                <Route path="/register" element={<Register/>} />
                <Route path="/login" element={<Login/>} />
                <Route path="/profile" element={<UserProfile/>} />
                <Route element={<ErrorPage/>} />
            </Routes>
        </div>
    );
}

export default Layout;