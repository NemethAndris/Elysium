import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import { createRoot } from 'react-dom/client';
import Layout from './components/Layout';
import './index.css';

createRoot(document.getElementById('root')).render(
    <BrowserRouter>
        <Layout />
    </BrowserRouter>
);