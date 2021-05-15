package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.GynecologicalPage;

import java.util.List;

public interface GynecologicalPageService {
    List<GynecologicalPage> findByPatientUsername(String username);

    List<GynecologicalPage> findByPatientId(long patientId);

    boolean save(GynecologicalPage gynecologicalPage);
}
