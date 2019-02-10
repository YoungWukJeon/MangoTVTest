package com.study.mangotv.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginViewController {

    @GetMapping("/login")
    public String page(ModelAndView mav) {
        return "login";
    }
}