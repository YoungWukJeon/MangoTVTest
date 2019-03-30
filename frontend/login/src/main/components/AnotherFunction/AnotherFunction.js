import React, { Component } from "react";

import "./AnotherFunction.scss";
import { PropTypes } from "prop-types";

class AnotherFunction extends Component {
  static propTypes = {
    text: PropTypes.string.isRequired,
    url: PropTypes.string.isRequired
  };

  render() {
    return (
      <div className="another-function">
        <a href={this.props.url} className="link-url">
          <span data-translate={this.props.text}>{this.props.text}</span>
        </a>
      </div>
    );
  }
}

export default AnotherFunction;
