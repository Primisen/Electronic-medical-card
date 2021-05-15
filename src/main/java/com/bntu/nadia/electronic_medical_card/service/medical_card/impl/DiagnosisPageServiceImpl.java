package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.DiagnosisPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.DiagnosisPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.DiagnosisPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiagnosisPageServiceImpl implements DiagnosisPageService {

    @Autowired
    private DiagnosisPageRepository diagnosisPageRepository;

    @Override
    public List<DiagnosisPage> findByPatientUsername(String username) {

        return diagnosisPageRepository.findDiagnosisPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<DiagnosisPage> findByPatientId(long patientId) {
        return diagnosisPageRepository.findDiagnosisPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(DiagnosisPage diagnosisPage){

        diagnosisPageRepository.save(diagnosisPage);
        return true;
    }
}
