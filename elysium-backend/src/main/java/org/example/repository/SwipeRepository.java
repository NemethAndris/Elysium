package org.example.repository;


import org.example.model.job.SwipedJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SwipeRepository extends JpaRepository<SwipedJob, UUID> {
}
