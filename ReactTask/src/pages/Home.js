import React from "react";
import { Link } from "react-router-dom";
import "../App.css";

const Home = () => (
  <div className="home-container">
    <h2>SS Hospital</h2>
    <p>Book and manage your appointments easily.</p>
    <Link to="/book">
      <button className="book-appointment-btn">Book Appointment</button>
    </Link>
  </div>
);

export default Home;
