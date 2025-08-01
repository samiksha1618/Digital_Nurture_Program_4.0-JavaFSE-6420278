// src/OfficeList.js
import React from 'react';

// Office list array (list of objects)
const officeList = [
  { name: 'WeWork', rent: 45000, address: 'MG Road, Bengaluru' },
  { name: 'Cowrks', rent: 60000, address: 'Kondapur, Hyderabad' },
  { name: 'Regus', rent: 75000, address: 'Connaught Place, Delhi' },
  { name: '91Springboard', rent: 58000, address: 'Baner, Pune' }
];

const OfficeList = () => {
  return (
    <div>
      {/* JSX heading */}
      <h1>🏢 Office Space Rental</h1>

      {/* JSX Image */}
      <img
        src="https://via.placeholder.com/500x250?text=Office+Space"
        alt="Office Space"
        width="500"
        height="250"
      />

      <h2>Available Spaces:</h2>

      {/* JSX list with expressions */}
      {officeList.map((office, index) => {
        const rentStyle = {
          color: office.rent < 60000 ? 'red' : 'green',
          fontWeight: 'bold'
        };

        return (
          <div key={index} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px' }}>
            <p><strong>Name:</strong> {office.name}</p>
            <p><strong>Address:</strong> {office.address}</p>
            <p style={rentStyle}><strong>Rent:</strong> ₹{office.rent}</p>
          </div>
        );
      })}
    </div>
  );
};

export default OfficeList;
