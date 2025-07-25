import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails(props) {
  // Determine heading color based on cohort status
  const headingStyle = {
    color: props.status.toLowerCase() === 'ongoing' ? 'green' :
           props.status.toLowerCase() === 'scheduled' ? 'blue' :
           'black'
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>{props.name}</h3>
      <dl>
        <dt>Status:</dt>
        <dd>{props.status}</dd>

        <dt>Start Date:</dt>
        <dd>{props.startDate}</dd>

        <dt>End Date:</dt>
        <dd>{props.endDate !== '--' ? props.endDate : 'TBD'}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
