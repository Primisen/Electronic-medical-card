package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.TemporaryDisabilityPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemporaryDisabilityPageRepository extends JpaRepository<TemporaryDisabilityPage, Long> {

    List<TemporaryDisabilityPage> findTemporaryDisabilityPagesByMedicalCard_PatientUsernameContaining(String username);

    List<TemporaryDisabilityPage> findTemporaryDisabilityPagesByMedicalCard_PatientId(long patientId);
}
