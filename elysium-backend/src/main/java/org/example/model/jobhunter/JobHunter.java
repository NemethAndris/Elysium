package org.example.model.jobhunter;

import jakarta.persistence.*;
import lombok.*;
import org.example.model.User;
import org.example.model.company.Employer;
import org.example.model.cv.Cv;
import org.example.model.job.Job;

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

    @OneToMany(mappedBy = "jobHunter")
    private Collection<Cv> cvs;

    @ManyToMany
    private Collection<Job> swipedJobs;

    @ManyToMany
    private Collection<Employer> blockedEmployers;


}
