package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.PersonalPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.PersonalPageRepository;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.added.AddressRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.PersonalPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonalPageServiceImpl implements PersonalPageService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonalPageRepository personalPageRepository;

    @Override
    public boolean save(PersonalPage personalPage) {

        addressRepository.save(personalPage.getAddress());
        personalPageRepository.save(personalPage);

        return true;
    }

    //    @Override
    public PersonalPage findByPatientUsername(String username) {

        List<PersonalPage> personalPages = personalPageRepository.findAll();

        for (PersonalPage personalPage : personalPages) {

            if (personalPage.getMedicalCard().getPatient().getUsername().equals(username)){
                return personalPage;
            }
        }

        return null;
    }

    @Override
    public PersonalPage findByPatientId(long id) {
        List<PersonalPage> personalPages = personalPageRepository.findAll();

        for (PersonalPage personalPage : personalPages) {

            if (personalPage.getMedicalCard().getPatient().getId() == id){
                return personalPage;
            }
        }

        return null;
    }
}
