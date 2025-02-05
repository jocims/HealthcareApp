package com.example.healthcareapp.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor  // ✅ This is required by Hibernate!
@AllArgsConstructor
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private LocalDate dateOfBirth;
    private String employeeAddress;
    private String email;
    private String password;
    private String userType;

    private boolean isActive; // Indicates if the user account is active or deactivated


    @CreationTimestamp  // Automatically sets when first created
    @Column(updatable = false) // Prevents updates after creation
    private LocalDateTime createdAt;

    @UpdateTimestamp  // Updates automatically on each change
    private LocalDateTime updatedAt;

}
