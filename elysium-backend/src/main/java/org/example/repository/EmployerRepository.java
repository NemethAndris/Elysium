package org.example.repository;

import org.example.model.users.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EmployerRepository extends JpaRepository<Employer, UUID> {
    boolean existsEmployerByUserNameAndPasswordAndUserEmail(String username, String password, String userEmail);
}
