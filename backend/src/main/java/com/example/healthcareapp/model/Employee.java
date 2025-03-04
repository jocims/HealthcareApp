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
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private LocalDate admissionDate;
    private String employeeCategory;
    private String registrationNumber;
    private LocalDate registrationExpireDate;
    private String status;
    private LocalDate dischargeDate;

    @CreationTimestamp  // Automatically sets when first created
    @Column(updatable = false) // Prevents updates after creation
    private LocalDateTime createdAt;

    @UpdateTimestamp  // Updates automatically on each change
    private LocalDateTime updatedAt;

    //Foreign Keys
    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne // Establish a many-to-one relationship with WorkBase
    @JoinColumn(name = "workBaseId", nullable = false) // The foreign key column in the Employee table
    private WorkBase workBase; // Reference to the WorkBase object

}
