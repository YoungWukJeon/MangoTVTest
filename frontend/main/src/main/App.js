import React, { Component } from "react";
import "./App.scss";

import MainHeader from "./components/MainHeader/MainHeader";

class App extends Component {
  render() {
    return (
      <div className="main">  
        <MainHeader />
      </div>
    );
  }
};

export default App;