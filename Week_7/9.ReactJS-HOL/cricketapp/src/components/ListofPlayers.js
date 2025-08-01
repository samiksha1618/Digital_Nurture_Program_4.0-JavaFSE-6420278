// src/components/ListofPlayers.js
import React from 'react';

const players = [
  { name: 'Virat Kohli', score: 95 },
  { name: 'Rohit Sharma', score: 80 },
  { name: 'KL Rahul', score: 60 },
  { name: 'Hardik Pandya', score: 72 },
  { name: 'Shubman Gill', score: 68 },
  { name: 'Ravindra Jadeja', score: 55 },
  { name: 'Jasprit Bumrah', score: 85 },
  { name: 'Rishabh Pant', score: 70 },
  { name: 'Shreyas Iyer', score: 45 },
  { name: 'Mohammed Shami', score: 62 },
  { name: 'Axar Patel', score: 74 }
];

const ListofPlayers = () => {
  const filteredPlayers = players.filter(player => player.score < 70); // ES6 arrow

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score &lt; 70:</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
