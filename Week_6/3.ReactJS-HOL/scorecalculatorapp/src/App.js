import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <h1 style={{ textAlign: 'center' }}>Student Management Portal</h1>
      <CalculateScore name="Samiksha Thakre" school="Shree Convent High School" total={460} goal={5} />
    </div>
  );
}

export default App;
