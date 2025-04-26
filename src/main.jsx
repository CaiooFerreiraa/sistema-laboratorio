import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './index.css';
import App from './App.jsx';
import Cad_Amostra from './pages/cad_amostra.jsx';

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<App />} />
        <Route path="/cad_amostra" element={<Cad_Amostra />} />
      </Routes>
    </BrowserRouter>
  </StrictMode>
);
