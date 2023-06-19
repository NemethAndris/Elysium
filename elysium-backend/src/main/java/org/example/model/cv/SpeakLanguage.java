package org.example.model.cv;

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

public class SpeakLanguage {
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
