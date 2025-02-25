import React from 'react';
import ReactDOM from 'react-dom/client';

class Course extends React.Component {
  render() {
    return <h2>{this.props.name} </h2>;
  }
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Course  name="Information technology"/>);