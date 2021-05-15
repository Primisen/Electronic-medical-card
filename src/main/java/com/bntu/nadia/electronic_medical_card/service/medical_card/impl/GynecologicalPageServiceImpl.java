package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.GynecologicalPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.GynecologicalPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.GynecologicalPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GynecologicalPageServiceImpl implements GynecologicalPageService {

    @Autowired
    private GynecologicalPageRepository gynecologicalPageRepository;

    @Override
    public List<GynecologicalPage> findByPatientUsername(String username) {

        return gynecologicalPageRepository.findGynecologicalPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<GynecologicalPage> findByPatientId(long patientId) {
        return gynecologicalPageRepository.findGynecologicalPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(GynecologicalPage gynecologicalPage){

        gynecologicalPageRepository.save(gynecologicalPage);
        return true;
    }
}
