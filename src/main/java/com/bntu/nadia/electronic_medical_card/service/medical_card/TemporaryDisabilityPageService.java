package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.TemporaryDisabilityPage;

import java.util.List;

public interface TemporaryDisabilityPageService {
    List<TemporaryDisabilityPage> findByPatientUsername(String username);

    List<TemporaryDisabilityPage> findByPatientId(long patientId);

    boolean save(TemporaryDisabilityPage temporaryDisabilityPage);
}
