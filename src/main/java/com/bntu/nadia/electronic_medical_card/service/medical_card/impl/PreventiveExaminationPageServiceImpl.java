package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.PreventiveExaminationPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.PreventiveExaminationPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.PreventiveExaminationPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PreventiveExaminationPageServiceImpl implements PreventiveExaminationPageService {

    @Autowired
    private PreventiveExaminationPageRepository preventiveExaminationPageRepository;

    @Override
    public List<PreventiveExaminationPage> findByPatientUsername(String username) {

        return preventiveExaminationPageRepository.findPreventiveExaminationPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<PreventiveExaminationPage> findByPatientId(long patientId) {
        return preventiveExaminationPageRepository.findPreventiveExaminationPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(PreventiveExaminationPage preventiveExaminationPage){
        preventiveExaminationPageRepository.save(preventiveExaminationPage);
        return true;
    }
}
