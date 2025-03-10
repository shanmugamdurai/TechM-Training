import React from "react";
import "../App.css";

const AppointmentForm = ({ formData, handleInputChange, handleSubmit }) => (
  <form onSubmit={handleSubmit} className="mb-3 form-box">
    <div className="mb-2">
      <label className="form-label">Name</label>
      <input
        type="text"
        className="form-control"
        name="name"
        value={formData.name}
        onChange={handleInputChange}
        required
      />
    </div>
    <div className="mb-2">
      <label className="form-label">Date</label>
      <input
        type="date"
        className="form-control"
        name="date"
        value={formData.date}
        onChange={handleInputChange}
        required
      />
    </div>
    <button type="submit" className="btn btn-primary">Book Appointment</button>
  </form>
);

export default AppointmentForm;