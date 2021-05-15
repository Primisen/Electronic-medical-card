package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.GynecologicalPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GynecologicalPageRepository extends JpaRepository<GynecologicalPage, Long> {

    List<GynecologicalPage> findGynecologicalPagesByMedicalCard_PatientUsernameContaining(String username);

    List<GynecologicalPage> findGynecologicalPagesByMedicalCard_PatientId(long patientId);
}
