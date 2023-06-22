import React, { useState } from 'react';
import axios from 'axios';

const RegisterAsEmployer = () => {
    const [userName, setUserName] = useState('');
    const [userEmail, setUserEmail] = useState('');
    const [password, setPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();

        if (password !== confirmPassword) {
            alert('Passwords do not match. Please try again.');
            return;
        }

        try {
            const response = await axios.post('http://localhost:8080/employer/registration', {
                userName,
                userEmail,
                password,
            });

            console.log('Registration successful', response.data);
        } catch (error) {

            console.error('Error during registration', error);
        }
    };

    return (
        <div>
            <h1 className="text-2xl font-bold mb-4">Register as Employer</h1>
            <form className="max-w-md mx-auto" onSubmit={handleSubmit}>
                <div className="mb-4">
                    <label htmlFor="username" className="block mb-2">
                        Username:
                    </label>
                    <input
                        type="text"
                        id="username"
                        className="w-full px-4 py-2 border rounded"
                        placeholder="Enter your username"
                        value={userName}
                        onChange={(e) => setUserName(e.target.value)}
                        required
                    />
                </div>
                <div className="mb-4">
                    <label htmlFor="email" className="block mb-2">
                        Email:
                    </label>
                    <input
                        type="email"
                        id="email"
                        className="w-full px-4 py-2 border rounded"
                        placeholder="Enter your email"
                        value={userEmail}
                        onChange={(e) => setUserEmail(e.target.value)}
                        required
                    />
                </div>
                <div className="mb-4">
                    <label htmlFor="password" className="block mb-2">
                        Password:
                    </label>
                    <input
                        type="password"
                        id="password"
                        className="w-full px-4 py-2 border rounded"
                        placeholder="Enter your password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        required
                    />
                </div>
                <div className="mb-4">
                    <label htmlFor="confirmPassword" className="block mb-2">
                        Confirm Password:
                    </label>
                    <input
                        type="password"
                        id="confirmPassword"
                        className="w-full px-4 py-2 border rounded"
                        placeholder="Confirm your password"
                        value={confirmPassword}
                        onChange={(e) => setConfirmPassword(e.target.value)}
                        required
                    />
                </div>
                <button
                    type="submit"
                    className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
                >
                    Register
                </button>
            </form>
        </div>
    );
};

export default RegisterAsEmployer;