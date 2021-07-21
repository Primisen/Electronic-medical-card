package com.bntu.nadia.electronic_medical_card.controller;

import com.bntu.nadia.electronic_medical_card.model.user.User;
import com.bntu.nadia.electronic_medical_card.service.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class MedicalWorkerController {

    @Autowired
    private UserService userService;

    @GetMapping("/patients")
    public String patients(ModelMap model) {

        List<User> patients = userService.findAllPatients();

        Collections.sort(patients, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getSurname().compareTo(user2.getSurname());
            }
        });

        model.addAttribute("patients", patients);

        return "patients_list";
    }

}
