package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.TemporaryDisabilityPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.TemporaryDisabilityPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.TemporaryDisabilityPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TemporaryDisabilityPageServiceImpl implements TemporaryDisabilityPageService {

    @Autowired
    private TemporaryDisabilityPageRepository temporaryDisabilityPageRepository;

    @Override
    public List<TemporaryDisabilityPage> findByPatientUsername(String username) {

        return temporaryDisabilityPageRepository.findTemporaryDisabilityPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<TemporaryDisabilityPage> findByPatientId(long patientId) {
        return temporaryDisabilityPageRepository.findTemporaryDisabilityPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(TemporaryDisabilityPage temporaryDisabilityPage){

        temporaryDisabilityPageRepository.save(temporaryDisabilityPage);
        return true;
    }
}
