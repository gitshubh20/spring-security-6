package com.shubhproject.security.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("")
    public String welcome() {
        return "This is Spring Security Practice Project";
    }
        @GetMapping("/csrf")
       public  CsrfToken getToken(HttpServletRequest request){
            return (CsrfToken) request.getAttribute("_csrf");
        }
}
