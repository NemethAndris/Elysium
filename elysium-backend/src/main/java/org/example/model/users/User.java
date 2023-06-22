package org.example.model.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @Column(unique = true)
    private String userName;
    @Column
    private String userEmail;
    @Column
    @JsonIgnore
    private String password;

    @Column
    private boolean isAdmin;

    @Column
    private boolean isBanned;

    @Column
    @CreationTimestamp
    private Timestamp dateOfRegistration;


}
