import React from "react";
import "./App.css";

import LoginLogo from "./components/LoginLogo/LoginLogo";
import LoginInfo from "./components/LoginInfo/LoginInfo";
import LoginForm from "./components/LoginForm/LoginForm";

const App = () => (
  <div className="login">
    <LoginLogo name="Mango" />
    <LoginInfo />
    <LoginForm />
  </div>
);

export default App;
