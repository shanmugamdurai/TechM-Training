import React, { useEffect, useState } from "react";
import axios from "axios";
import "../App.css";

const AppointmentList = () => {
  const [appointments, setAppointments] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:4500/appointments")
      .then((response) => setAppointments(response.data))
      .catch((error) => console.error("Error fetching appointments:", error));
  }, []);

  return (
    <div className="list-container">
      <h2>Appointment Info</h2>
      <ul className="list-box">
        {appointments.length > 0 ? (
          appointments.map((appointment) => (
            <li key={appointment.id} className="list-group-item">
              <span><strong>Name:</strong> {appointment.name}</span><br />
              <span><strong>Date:</strong> {appointment.date}</span><br />
              <span><strong>Time:</strong> {appointment.time}</span>
            </li>
          ))
        ) : (
          <p>No appointments booked yet.</p>
        )}
      </ul>
    </div>
  );
};

export default AppointmentList;
