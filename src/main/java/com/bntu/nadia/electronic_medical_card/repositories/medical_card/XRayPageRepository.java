package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.XRayPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface XRayPageRepository extends JpaRepository<XRayPage, Long> {

    List<XRayPage> findXRayPagesByMedicalCard_PatientUsernameContaining(String username);

    List<XRayPage> findXRayPagesByMedicalCard_PatientId(long patientId);
}
