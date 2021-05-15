package com.bntu.nadia.electronic_medical_card.repositories.medical_card.added;

import com.bntu.nadia.electronic_medical_card.model.medical_card.added.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {
}
