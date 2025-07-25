// src/OnlineShopping.js
import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
  constructor() {
    super();
    this.state = {
      cartItems: [
        { itemname: 'Mobile', price: 15000 },
        { itemname: 'Laptop', price: 55000 },
        { itemname: 'Watch', price: 3000 },
        { itemname: 'Shoes', price: 2500 },
        { itemname: 'Backpack', price: 1200 }
      ]
    };
  }

  render() {
    return (
      <div>
        <h2>Welcome to Online Shopping Portal</h2>
        {this.state.cartItems.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
