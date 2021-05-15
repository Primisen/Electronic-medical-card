package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.VaccinationPage;

import java.util.List;

public interface VaccinationPageService {
    List<VaccinationPage> findByPatientUsername(String username);

    List<VaccinationPage> findByPatientId(long patientId);

    boolean save(VaccinationPage vaccinationPage);
}
