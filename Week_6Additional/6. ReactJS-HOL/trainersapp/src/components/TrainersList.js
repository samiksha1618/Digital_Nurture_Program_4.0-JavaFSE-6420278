import React from 'react';
import trainers from '../TrainersMock';

function TrainersList() {
  return (
    <div>
      <h2>Trainer List</h2>
      {trainers.map((t) => (
        <div key={t.trainerId}>
          <h3>{t.name}</h3>
          <p><strong>Technology:</strong> {t.technology}</p>
          <p><strong>Email:</strong> {t.email}</p>
          <p><strong>Phone:</strong> {t.phone}</p>
          <p><strong>Skills:</strong> {t.skills.join(', ')}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default TrainersList;
