import React from 'react';
import ReactDOM from 'react-dom/client';

class Game extends React.Component {
  render() {
    return <h1>Cricket</h1>;
  }
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Game />);