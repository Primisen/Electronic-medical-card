package com.bntu.nadia.electronic_medical_card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/registration-applications")
    public String registrationApplications(){
        return "registration_application";
    }
}
