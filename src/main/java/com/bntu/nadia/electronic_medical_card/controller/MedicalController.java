package com.bntu.nadia.electronic_medical_card.controller;

import com.bntu.nadia.electronic_medical_card.model.medical_card.added.Gender;
import com.bntu.nadia.electronic_medical_card.model.user.User;
import com.bntu.nadia.electronic_medical_card.service.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MedicalController {

    @Autowired
    private UserService userService;

    @GetMapping("/medical_helper")
    public String medicalHelpPage(){
        return "medical_helper";
    }

    @GetMapping("/patients")
    public String patients(ModelMap model){

        List<User> patients = userService.findAllPatients();
        model.put("patients", patients);
        model.addAttribute("womanGender", Gender.WOMAN.getRussianValue());


        return "patients_list";
    }

}
