package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @Column(unique = true)
    private String userName;
    @Column
    @JsonIgnore
    private String password;
    @Column
    private String userBio;
    @JoinColumn
    @ManyToOne
    private WorkField workField;
    @JoinColumn
    @OneToMany
    private Collection<Language> languages;
    @JoinColumn
    @ManyToMany
    private Collection<Swipe> swipes;
    @Column
    private String userEmail;
    @Column
    private String profilePicture;
    @Column
    private boolean isAdmin;
    @Column
    private boolean isBanned;
    @Column
    @CreationTimestamp
    private Timestamp dateOfRegistration;
    @JoinColumn
    @ManyToMany
    private Collection<User> matches;

    @JoinColumn
    @ManyToMany
    private Collection<User> blockedUsers;



}
