package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalCardRepository extends JpaRepository<MedicalCard, Long> {

    MedicalCard findMedicalCardByPatientId(long patientId);

    MedicalCard findMedicalCardByPatientUsername(String username);
}
