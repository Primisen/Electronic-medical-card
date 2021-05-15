package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.DiagnosisPage;

import java.util.List;

public interface DiagnosisPageService {
    List<DiagnosisPage> findByPatientUsername(String name);

    List<DiagnosisPage> findByPatientId(long parseLong);

    boolean save(DiagnosisPage diagnosisPage);
}
