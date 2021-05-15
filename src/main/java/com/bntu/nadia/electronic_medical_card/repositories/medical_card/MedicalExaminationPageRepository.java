package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.MedicalExaminationPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalExaminationPageRepository extends JpaRepository<MedicalExaminationPage, Long> {

    List<MedicalExaminationPage> findMedicalExaminationPagesByMedicalCard_PatientUsernameContaining(String username);

    List<MedicalExaminationPage> findMedicalExaminationPagesByMedicalCard_PatientId(long patientId);
}
