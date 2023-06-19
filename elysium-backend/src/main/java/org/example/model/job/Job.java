package org.example.model.job;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.company.Employer;

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

    @OneToMany(mappedBy = "job")
    private Collection<SwipedJob> swipedByJobHunters;

    @Column
    private String jobDescription;

    @ManyToOne
    @JoinColumn
    private Employer company;




}
