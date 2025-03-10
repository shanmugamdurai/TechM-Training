import React, { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import "../App.css";

const AppointmentForm = () => {
  const [name, setName] = useState("");
  const [date, setDate] = useState("");
  const [time, setTime] = useState("");
  const navigate = useNavigate();

  const timeSlots = [
    "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
      "04:00 PM", "05:00 PM","06:00 PM","7.00 PM"
  ];

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (name && date && time) {
      await axios.post("http://localhost:4500/appointments", {
        name, date, time
      });
      navigate("/appointments");
    }
  };

  return (
    <div className="form-container">
      <h2>Book an Appointment</h2>
      <form onSubmit={handleSubmit} className="form-box">
        <div>
          <label>Name:</label>
          <input type="text" value={name} onChange={(e) => setName(e.target.value)} required />
        </div>
        <div>
          <label>Appointment Date:</label>
          <input type="date" value={date} onChange={(e) => setDate(e.target.value)} required />
        </div>
        <div>
          <label>Time Slot:</label>
          <select value={time} onChange={(e) => setTime(e.target.value)} required>
            <option value="">Select Time</option>
            {timeSlots.map((slot, index) => (
              <option key={index} value={slot}>{slot}</option>
            ))}
          </select>
        </div>
        <button type="submit">Book Appointment</button>
      </form>
    </div>
  );
};

export default AppointmentForm;
