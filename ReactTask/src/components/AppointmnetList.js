import React from "react";
import "../App.css";

const AppointmentList = ({ appointments }) => (
  <ul className="list-group list-box">
    {appointments.map((appointment) => (
      <li key={appointment.id} className="list-group-item">
        {appointment.name} - {appointment.date || "No date provided"}
      </li>
    ))}
  </ul>
);

export default AppointmentList;