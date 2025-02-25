import React from 'react';
import ReactDOM from 'react-dom/client';

function Flower(props) {
  return <h2>{props.name}</h2>;
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Flower  name="ROSE"/>);