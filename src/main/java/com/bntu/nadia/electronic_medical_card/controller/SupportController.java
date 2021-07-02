package com.bntu.nadia.electronic_medical_card.controller;

import com.bntu.nadia.electronic_medical_card.service.spring.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SupportController {

    @Autowired
    private EmailServiceImpl emailService;

    @GetMapping("/support")
    public String support() {
        return "support";
    }

    @PostMapping("/support")
    public void sendMessage(String message, String email) {

//        emailService.sendMessage("primise@gmail.com",email, message);
        emailService.sendMessage("primisen17@gmail.com", "dddddd", "message");

    }
}
