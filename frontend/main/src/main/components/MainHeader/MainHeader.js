import React, { Component } from "react";

import MainHeaderLogo from "./MainHeaderLogo/MainHeaderLogo";
import MainHeaderSearch from "./MainHeaderSearch/MainHeaderSearch";
import MainHeaderLoginArea from "./MainHeaderLoginArea/MainHeaderLoginArea";

import "./MainHeader.scss";

class MainHeader extends Component {
  render() {
    return (
      <div className="main-header">
        <MainHeaderLogo />
        <MainHeaderSearch />
        <MainHeaderLoginArea />
      </div>
    );
  }
}

export default MainHeader;