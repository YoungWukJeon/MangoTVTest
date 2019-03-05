import React, { Component } from "react";

import LabelInput from "../LabelInput/LabelInput";
import AnotherFunction from "../AnotherFunction/AnotherFunction";

import "./LoginForm.scss";

const errorMap = {
  NOT_EXISTED_USER: () => "존재하지 않는 아이디입니다.",
  MISSMATCHING_PW: () => "비밀번호가 일치하지 않습니다.",
  FIELD_RULE: payload => {
    const rules = {
      idEmpty: "아이디를 입력하세요!",
      pwEmpty: "비밀번호를 입력하세요!"
    };
    return rules[payload] || "입력한 데이터가 문제가 있습니다.";
  }
};

const printError = error => {
  if (!errorMap[error.name]) {
    return "알 수 없는 에러 발생!";
  }

  return errorMap[error.name](error.payload);
};

class LoginForm extends Component {
  constructor(props) {
    super(props);

    this.state = {
      error: null
    };

    this.onSubmit = this.onSubmit.bind(this);
  }

  onSubmit = event => {
    console.log("Do Login!");

    const id = LabelInput.getValue("uid");
    const pw = LabelInput.getValue("upw");
    console.log(`id: ${id}, pw: ${pw}`);

    if (!id) {
      console.warn("You need to input ID!!");
      LabelInput.requestFocus("uid");
      this.setState({
        ...this,
        error: {
          name: "FIELD_RULE",
          payload: "idEmpty"
        }
      });
      event.preventDefault();
      return;
    }

    if (!pw) {
      console.warn("You need to input PW!!");
      LabelInput.requestFocus("upw");
      this.setState({
        ...this,
        error: {
          name: "FIELD_RULE",
          payload: "pwEmpty"
        }
      });
      event.preventDefault();
      return;
    }

    this.setState({
      ...this,
      error: null
    });

    console.log("Login Success!!");
  };

  render() {
    return (
      <form
        action="/"
        method="GET"
        className="login-form"
        onSubmit={this.onSubmit}
      >
        <fieldset className="login-form">
          <legend>로그인 입력 폼</legend>
          <LabelInput
            labelId="uid-label"
            labelText="아이디"
            inputId="uid"
            inputName="uid"
            inputType="text"
            inputTitle="아이디 입력"
            inputMaxLength={50}
          />
          <LabelInput
            labelId="upw-label"
            labelText="비밀번호"
            inputId="upw"
            inputName="upw"
            inputType="text"
            inputTitle="비밀번호 입력"
            inputMaxLength={50}
          />
          {this.state.error && (
            <div className="error">{printError(this.state.error)}</div>
          )}
          <button type="submit">
            <span data-translate="로그인">로그인</span>
          </button>
          <div className="another-function-area">
            <AnotherFunction text="아이디/비번 찾기" url="/" />
            <AnotherFunction text="회원가입하기" url="/" />
          </div>
        </fieldset>
      </form>
    );
  }
}

export default LoginForm;
