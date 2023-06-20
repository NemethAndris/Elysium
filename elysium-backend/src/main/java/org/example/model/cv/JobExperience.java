package org.example.model.cv;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "cvId")
    private Cv cv;

    @Column
    private String companyName;

    @Column
    private String jobTitle;

    @Column
    private String jobDescription;

    @Column
    private Year startYear;

    @Column
    private Year endYear;


}
