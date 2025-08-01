// src/components/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const T20players = ['Kohli', 'Rohit', 'Gill', 'Pant', 'Surya'];
  const RanjiTrophyPlayers = ['Rahane', 'Pujara', 'Saha', 'Iyer', 'Ashwin'];

  // ES6 Merge using spread operator
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  // Destructuring with filtering odd/even indexed players
  const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
