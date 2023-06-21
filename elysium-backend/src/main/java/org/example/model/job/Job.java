package org.example.model.job;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.users.Employer;
import org.example.model.users.JobHunter;

import java.util.Collection;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String jobTitle;

    @ManyToMany
    private Collection<JobHunter> swipedByJobHunters;

    @Column
    private String jobDescription;

    @ManyToOne
    @JoinColumn(name = "employerId" )
    private Employer company;




}
