package org.example.model.jobhunter;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.enums.LanguageLevel;
import org.example.model.enums.LanguageType;

import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    @Enumerated(EnumType.STRING)
    private LanguageType language;

    @Column
    @Enumerated(EnumType.STRING)
    private LanguageLevel languageLevel;


}
