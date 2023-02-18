package com.example.jenkins_test5;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController::home()");
        return "home";
    }
}
