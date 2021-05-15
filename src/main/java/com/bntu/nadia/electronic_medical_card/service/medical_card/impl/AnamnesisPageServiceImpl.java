package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.AnamnesisPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.AnamnesisPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.AnamnesisPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnamnesisPageServiceImpl implements AnamnesisPageService {

    @Autowired
    private AnamnesisPageRepository anamnesisPageRepository;

    @Override
    public List<AnamnesisPage> findByPatientUsername(String username) {

        return anamnesisPageRepository.findAnamnesisPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<AnamnesisPage> findByPatientId(long patientId) {
        return anamnesisPageRepository.findAnamnesisPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(AnamnesisPage anamnesisPage){

        anamnesisPageRepository.save(anamnesisPage);
        return true;
    }
}
