package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalExaminationPage;

import java.util.List;

public interface MedicalExaminationPageService {
    List<MedicalExaminationPage> findByPatientUsername(String username);

    List<MedicalExaminationPage> findByPatientId(long patientId);

    boolean save(MedicalExaminationPage medicalExaminationPage);
}
