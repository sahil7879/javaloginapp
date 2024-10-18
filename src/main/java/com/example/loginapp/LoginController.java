package com.example.loginapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(String username, String password) {
        ModelAndView modelAndView = new ModelAndView();
        if ("user".equals(username) && "password".equals(password)) {
            modelAndView.setViewName("welcome");
            modelAndView.addObject("username", username);
        } else {
            modelAndView.setViewName("login");
            modelAndView.addObject("error", "Invalid username or password");
        }
        return modelAndView;
    }
}
