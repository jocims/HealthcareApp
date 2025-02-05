package com.example.healthcareapp.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medical_certificate")
public class MedicalCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long medicalCertificateId;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private String issuedBy; // Who issued the certificate
    private LocalDate issueDate;
    private LocalDate validUntil; // Expiration date of the certificate

    //To add the source code in the Controller Class
    private String medicalCertificateSource; // This can be the filename or URL of the uploaded file

    @CreationTimestamp  // Automatically sets when first created
    @Column(updatable = false) // Prevents updates after creation
    private LocalDateTime createdAt;

    @UpdateTimestamp  // Updates automatically on each change
    private LocalDateTime updatedAt;

}
