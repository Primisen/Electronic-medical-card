package com.bntu.nadia.electronic_medical_card.service.medical_card.impl;

import com.bntu.nadia.electronic_medical_card.model.medical_card.XRayPage;
import com.bntu.nadia.electronic_medical_card.repositories.medical_card.XRayPageRepository;
import com.bntu.nadia.electronic_medical_card.service.medical_card.XRayPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class XRayPageServiceImpl implements XRayPageService {

    @Autowired
    private XRayPageRepository xRayPageRepository;

    @Override
    public List<XRayPage> findByPatientUsername(String username) {

        return xRayPageRepository.findXRayPagesByMedicalCard_PatientUsernameContaining(username);
    }

    @Override
    public List<XRayPage> findByPatientId(long patientId) {
        return xRayPageRepository.findXRayPagesByMedicalCard_PatientId(patientId);
    }

    @Override
    public boolean save(XRayPage xRayPage){

        xRayPageRepository.save(xRayPage);
        return true;
    }
}
