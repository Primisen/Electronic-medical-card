package com.bntu.nadia.electronic_medical_card.repositories.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.VaccinationPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VaccinationPageRepository extends JpaRepository<VaccinationPage, Long> {

    List<VaccinationPage> findVaccinationPagesByMedicalCard_PatientUsernameContaining(String username);

    List<VaccinationPage> findVaccinationPagesByMedicalCard_PatientId(long patientId);
}
