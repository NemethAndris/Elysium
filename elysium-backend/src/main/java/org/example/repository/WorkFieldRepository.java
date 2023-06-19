package org.example.repository;

import org.example.model.jobhunter.WorkField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkFieldRepository extends JpaRepository<WorkField, UUID> {
}
