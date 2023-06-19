package org.example.model.cv;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.jobhunter.JobHunter;

import java.util.Collection;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cv {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "jobHunterId")
    private JobHunter jobHunter;

    @ManyToMany
    private Collection<SpeakLanguage> speakLanguage;

    @ManyToMany
    private Collection<Qualification> qualifications;

    @Column
    private String bio;



}
