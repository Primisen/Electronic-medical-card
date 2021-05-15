package com.bntu.nadia.electronic_medical_card.repositories.user;

import com.bntu.nadia.electronic_medical_card.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
