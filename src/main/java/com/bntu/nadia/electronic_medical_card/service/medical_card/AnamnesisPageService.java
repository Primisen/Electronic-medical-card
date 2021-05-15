package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.AnamnesisPage;

import java.util.List;

public interface AnamnesisPageService {
    List<AnamnesisPage> findByPatientUsername(String username);

    List<AnamnesisPage> findByPatientId(long patientId);

    boolean save(AnamnesisPage anamnesisPage);
}
