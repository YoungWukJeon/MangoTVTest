import React, { Component } from "react";
import PropTypes from "prop-types";

import "./LabelInput.scss";

class LabelInput extends Component {
  static propTypes = {
    labelId: PropTypes.string,
    labelText: PropTypes.string,
    inputId: PropTypes.string,
    inputName: PropTypes.string,
    inputType: PropTypes.string,
    inputTitle: PropTypes.string,
    inputMaxLength: PropTypes.number
  };

  static defaultProps = {
    labelId: "",
    labelText: "",
    inputId: "",
    inputName: "",
    inputType: "text",
    inputTitle: "",
    inputMaxLength: 50
  };

  static getValue = id => document.getElementById(id).value;

  static requestFocus = id => document.getElementById(id).focus();

  constructor(props) {
    super(props);

    this.state = {
      showLabelText: true
    };

    this.onFocus = this.onFocus.bind(this);
    this.onBlur = this.onBlur.bind(this);
  }

  onFocus = () => {
    this.setState({
      ...this,
      showLabelText: false
    });
  };

  onBlur = () => {
    const text = document.getElementById(this.props.inputId).value;

    if (text.length > 0) {
      this.setState({
        ...this
      });
      return;
    }
    this.setState({
      ...this,
      showLabelText: true
    });
  };

  render() {
    return (
      <p className="label-input">
        <label
          htmlFor={this.props.inputId}
          id={this.props.labelId}
          style={{
            display: this.state.showLabelText ? "inline-block" : "none"
          }}
        >
          <span data-translate={this.props.labelText}>
            {this.props.labelText}
          </span>
        </label>

        <input
          id={this.props.inputId}
          name={this.props.inputName}
          type={this.props.inputType}
          title={this.props.inputTitle}
          maxLength={this.props.inputMaxLength}
          onFocus={this.onFocus}
          onBlur={this.onBlur}
        />
      </p>
    );
  }
}

export default LabelInput;
