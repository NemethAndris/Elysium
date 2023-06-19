package org.example.model.company;

import jakarta.persistence.*;
import lombok.*;
import org.example.model.User;
import org.example.model.job.Job;
import org.example.model.jobhunter.JobHunter;


import java.util.Collection;
import java.util.UUID;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employer extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToMany(mappedBy = "company")
    private Collection<Job> jobs;

    @Column
    private String companyDescription;

    @ManyToMany
    private Collection<JobHunter> blockedEmployers;



}
