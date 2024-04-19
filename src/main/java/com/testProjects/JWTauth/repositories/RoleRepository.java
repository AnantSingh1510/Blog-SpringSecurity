package com.testProjects.JWTauth.repositories;

import com.testProjects.JWTauth.models.ERole;
import com.testProjects.JWTauth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
