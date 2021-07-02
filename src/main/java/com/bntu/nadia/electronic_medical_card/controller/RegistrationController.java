package com.bntu.nadia.electronic_medical_card.controller;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalCard;
import com.bntu.nadia.electronic_medical_card.model.user.User;
import com.bntu.nadia.electronic_medical_card.service.medical_card.impl.MedicalCardServiceImpl;
import com.bntu.nadia.electronic_medical_card.service.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ComponentScan(basePackages = "com.bntu.nadia.electronic_medical_card")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private MedicalCardServiceImpl medicalCardService;

    @GetMapping("/medical-registration")
    public String medicalRegistration(Model model) {
        model.addAttribute("userForm", new User());

        return "medical_registration";
    }

    @PostMapping("/medical-registration")
    public String addMedical(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "medical_registration";
        }
        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())){
            model.addAttribute("passwordError", "Пароли не совпадают");
            return "medical_registration";
        }
        if (!userService.saveMedical(userForm)){
            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
            return "medical_registration";
        }

        return "redirect:/login";
    }

    @GetMapping("/registration")
    public String testRegistration(ModelMap model) {
        model.addAttribute("medicalCardForm", new MedicalCard());

        return "registration";
    }

    @PostMapping("/registration")
    public String addMedicalCard(@ModelAttribute("medicalCardForm") MedicalCard medicalCard, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()) {
            System.out.println("1");
            for (int i = 0; i < bindingResult.getErrorCount(); i++) {
                System.out.println(bindingResult.getAllErrors().get(i).toString());
            }
            return "registration";
        }
        if (!medicalCard.getPatient().getPassword().equals(medicalCard.getPatient().getPasswordConfirm())){
            model.addAttribute("passwordError", "Пароли не совпадают");
            System.out.println("2");
            return "registration";
        }
//        if (!userService.savePatient(medicalCard.getPatient())){
//            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
//            System.out.println("3");
//            return "test_registration";
//        }

//        medicalCard.getPersonalPage().setDateOfBirth(new GregorianCalendar(2020, 5, 8));
//        medicalCard.getPersonalPage().setGender(Gender.WOMAN);
//        userService.savePatient(medicalCard.getPatient());

//        int day = Integer.parseInt(model.getAttribute("day").toString());
//        int month = Integer.parseInt(model.getAttribute("month").toString());
//        int year = Integer.parseInt(model.getAttribute("year").toString());

//        Date date  = new Date();
//
//
//        System.out.println(day + " rgrg" + month + " " + year );
//        medicalCard.getPersonalPage().setDateOfBirth(new Date(year, month, day));
        System.out.println("3");
        medicalCardService.save(medicalCard);
        System.out.println("5");

        return "redirect:/login";
    }
}
