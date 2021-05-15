package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.PreventiveExaminationPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreventiveExaminationPageRepository extends JpaRepository<PreventiveExaminationPage, Long> {

    List<PreventiveExaminationPage> findPreventiveExaminationPagesByMedicalCard_PatientUsernameContaining(String username);

    List<PreventiveExaminationPage> findPreventiveExaminationPagesByMedicalCard_PatientId(long patientId);
}
