import React from 'react';
import CohortDetails from './Components/CohortDetails';
import './App.css';

function App() {
  return (
    <div className="App">
      <h1>My Academy Dashboard</h1>
      <CohortDetails
        name="INTADMDF10 - .NET FSD"
        status="scheduled"
        startDate="22-Feb-2022"
        endDate="--"
      />
      <CohortDetails
        name="ADM21JF014 - Java FSD"
        status="ongoing"
        startDate="10-Sep-2021"
        endDate="--"
      />
      <CohortDetails
        name="CDBJF21025 - Java FSD"
        status="ongoing"
        startDate="24-Dec-2021"
        endDate="--"
      />
    </div>
  );
}

export default App;
