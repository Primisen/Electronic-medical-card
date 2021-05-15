package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalCard;
import com.bntu.nadia.electronic_medical_card.model.medical_card.PersonalPage;
import com.bntu.nadia.electronic_medical_card.model.user.User;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.MedicalCardRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.MedicalCardService;
import com.bntu.nadia.electronic_medical_card.service.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicalCardServiceImpl implements MedicalCardService {

    @Autowired
    private PersonalPageServiceImpl personalPageService;

    @Autowired
    private MedicalCardRepository medicalCardRepository;

    @Autowired
    private UserService userService;

    @Override
    public boolean save(MedicalCard medicalCard) {

        User patient = medicalCard.getPatient();
        PersonalPage personalPage = medicalCard.getPersonalPage();
        personalPage.setName(patient.getName());
        personalPage.setSurname(patient.getSurname());
        personalPage.setPatronymic(patient.getPatronymic());

        personalPageService.save(personalPage);

        userService.savePatient(medicalCard.getPatient());
        medicalCardRepository.save(medicalCard);

        return true;
    }

    @Override
    public MedicalCard findByPatientId(long patientId){

        return medicalCardRepository.findMedicalCardByPatientId(patientId);
    }

    @Override
    public MedicalCard findByPatientUsername(String username) {
        return medicalCardRepository.findMedicalCardByPatientUsername(username);
    }

}
