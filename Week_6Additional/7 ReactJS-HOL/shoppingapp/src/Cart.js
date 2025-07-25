// src/Cart.js
import React from 'react';

class Cart extends React.Component {
  render() {
    return (
      <div style={{ margin: '10px', padding: '10px', border: '1px solid #ccc' }}>
        <h3>Item: {this.props.itemname}</h3>
        <p>Price: ₹{this.props.price}</p>
      </div>
    );
  }
}

export default Cart;
