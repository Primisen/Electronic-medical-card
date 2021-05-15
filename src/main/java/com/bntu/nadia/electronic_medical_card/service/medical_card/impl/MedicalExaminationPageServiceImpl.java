package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalExaminationPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.MedicalExaminationPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.MedicalExaminationPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicalExaminationPageServiceImpl implements MedicalExaminationPageService {

    @Autowired
    private MedicalExaminationPageRepository medicalExaminationPageRepository;

    @Override
    public List<MedicalExaminationPage> findByPatientUsername(String username) {

        return medicalExaminationPageRepository.findMedicalExaminationPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<MedicalExaminationPage> findByPatientId(long patientId) {
        return medicalExaminationPageRepository.findMedicalExaminationPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(MedicalExaminationPage medicalExaminationPage){

        medicalExaminationPageRepository.save(medicalExaminationPage);
        return true;
    }
}
