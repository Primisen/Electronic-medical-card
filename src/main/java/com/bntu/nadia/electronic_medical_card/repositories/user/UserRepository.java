package com.bntu.nadia.electronic_medical_card.repositories.user;

import com.bntu.nadia.electronic_medical_card.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query(value = "select * from user join user_user_role on user.id=User_id join user_role on user_user_role.roles_id=user_role.id " +
            "join medical_card on user.id=medical_card.user_id join personal_part on medical_card.personal_part_id=personal_part.id where user_role.role_name='PATIENT'", nativeQuery = true)
    List<User> findAllPatients();

    User findBySurname(String surname);
}
