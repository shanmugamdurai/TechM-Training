import React from "react";
import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import Home from "./pages/Home";
import AppointmentFormPage from "./pages/AppointmentFormPage";
import AppointmentListPage from "./pages/AppointmentListPage";

const App = () => {
  return (
    <Router>
      <div className="container mt-5 app-container">
        <nav className="mb-3 nav-bar">
          <Link to="/" className="btn btn-primary me-2">Home</Link>
          <Link to="/book" className="btn btn-secondary me-2">Book Appointment</Link>
          <Link to="/appointments" className="btn btn-success">View Appointments</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/book" element={<AppointmentFormPage />} />
          <Route path="/appointments" element={<AppointmentListPage />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;