package com.backend.hackathon.persistance;

import com.tecnocampus.sprint1.domain.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,String> {
}
