// src/CountPeople.js
import React from 'react';

class CountPeople extends React.Component {
  constructor() {
    super();
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div style={{ padding: '20px', textAlign: 'center' }}>
        <h2>Welcome to the Mall</h2>
        <p>Number of People Entered: {this.state.entryCount}</p>
        <p>Number of People Exited: {this.state.exitCount}</p>
        <button onClick={this.updateEntry} style={{ marginRight: '10px' }}>
          Login
        </button>
        <button onClick={this.updateExit}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;
