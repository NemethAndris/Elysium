package org.example.model.users;

import jakarta.persistence.*;
import lombok.*;
import org.example.model.job.Job;


import java.util.Collection;



@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employer extends User {

    @OneToMany(mappedBy = "company")
    private Collection<Job> jobs;

    @Column
    private String companyDescription;

    @ManyToMany
    private Collection<JobHunter> blockedJobHunters;

    @Column
    private String companyAddress;



}
