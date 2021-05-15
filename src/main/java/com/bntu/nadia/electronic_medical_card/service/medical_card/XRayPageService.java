package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.XRayPage;

import java.util.List;

public interface XRayPageService {
    List<XRayPage> findByPatientUsername(String username);

    List<XRayPage> findByPatientId(long patientId);

    boolean save(XRayPage xRayPage);
}
