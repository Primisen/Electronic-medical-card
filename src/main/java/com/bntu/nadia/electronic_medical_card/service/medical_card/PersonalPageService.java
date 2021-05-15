package com.bntu.nadia.electronic_medical_card.service.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.PersonalPage;

public interface PersonalPageService {
    boolean save(PersonalPage personalPage);

    PersonalPage findByPatientUsername(String username);

    PersonalPage findByPatientId(long id);
}
