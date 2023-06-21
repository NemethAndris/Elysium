package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @Column
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
