package org.example.model.jobhunter;

import jakarta.persistence.*;
import lombok.*;
import org.example.model.User;
import org.example.model.company.Employer;
import org.example.model.job.SwipedJob;

import java.util.Collection;
import java.util.UUID;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class JobHunter extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String profileName;

    @Column
    private String profilePicture;

    @Column
    private String jobHunterBio;

    @JoinColumn
    @ManyToOne
    private WorkField workField;

    @JoinColumn
    @OneToMany
    private Collection<Language> languages;

    @Column
    private int salaryRequirement;

    @JoinColumn
    @OneToMany(mappedBy = "jobHunter")
    private Collection<SwipedJob> swipedJobs;

    @JoinColumn
    @ManyToMany
    private Collection<Employer> matchedEmployers;

    @JoinColumn
    @ManyToMany
    private Collection<Employer> blockedEmployers;


}
