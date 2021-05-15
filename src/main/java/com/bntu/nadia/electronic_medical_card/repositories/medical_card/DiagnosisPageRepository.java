package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.DiagnosisPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiagnosisPageRepository extends JpaRepository<DiagnosisPage, Long> {

    List<DiagnosisPage> findDiagnosisPagesByMedicalCard_PatientUsernameContaining(String username);

    List<DiagnosisPage> findDiagnosisPagesByMedicalCard_PatientId(long patientId);
}
