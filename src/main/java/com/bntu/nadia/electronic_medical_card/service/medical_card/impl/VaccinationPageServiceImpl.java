package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.VaccinationPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.VaccinationPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.VaccinationPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VaccinationPageServiceImpl implements VaccinationPageService {

    @Autowired
    private VaccinationPageRepository vaccinationPageRepository;

    @Override
    public List<VaccinationPage> findByPatientUsername(String username) {

        return vaccinationPageRepository.findVaccinationPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<VaccinationPage> findByPatientId(long patientId) {
        return vaccinationPageRepository.findVaccinationPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(VaccinationPage vaccinationPage){

        vaccinationPageRepository.save(vaccinationPage);
        return true;
    }
}
