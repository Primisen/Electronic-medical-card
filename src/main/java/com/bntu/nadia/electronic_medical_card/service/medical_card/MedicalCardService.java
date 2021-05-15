package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalCard;

public interface MedicalCardService {

    boolean save(MedicalCard medicalCard);

    MedicalCard findByPatientId(long patientId);

    MedicalCard findByPatientUsername(String name);
}
