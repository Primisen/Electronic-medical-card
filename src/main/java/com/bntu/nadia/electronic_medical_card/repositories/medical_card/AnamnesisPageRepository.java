package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.AnamnesisPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnamnesisPageRepository extends JpaRepository<AnamnesisPage, Long> {

    List<AnamnesisPage> findAnamnesisPagesByMedicalCard_PatientUsernameContaining(String username);

    List<AnamnesisPage> findAnamnesisPagesByMedicalCard_PatientId(long patientId);
}
