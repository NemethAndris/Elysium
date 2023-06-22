package org.example.repository;

import org.example.model.users.JobHunter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface JobHunterRepository extends JpaRepository<JobHunter, UUID> {

    boolean existsJobHunterByUserNameAndPasswordAndUserEmail(String username, String password, String userEmail);
}
