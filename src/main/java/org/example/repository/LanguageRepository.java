package org.example.repository;

import org.example.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface LanguageRepository extends JpaRepository<Language, UUID> {
}
