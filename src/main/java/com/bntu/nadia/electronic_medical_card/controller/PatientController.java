package com.bntu.nadia.electronic_medical_card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("/patient_helper")
    public String patientHelpPage(){
        return "patient_helper";
    }
}
