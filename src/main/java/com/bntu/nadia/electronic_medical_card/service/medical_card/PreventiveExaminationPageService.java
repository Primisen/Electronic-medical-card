package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.PreventiveExaminationPage;

import java.util.List;

public interface PreventiveExaminationPageService {

    List<PreventiveExaminationPage> findByPatientUsername(String username);

    List<PreventiveExaminationPage> findByPatientId(long patientId);

    boolean save(PreventiveExaminationPage preventiveExaminationPage);
}
