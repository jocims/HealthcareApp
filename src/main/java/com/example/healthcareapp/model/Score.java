package com.example.healthcareapp.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scoreId;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private int scoreValue; // e.g., score value
    private String criteria; // e.g., criteria on which the score is based

    //To add the source code in the Controller Class
    private String scoreSource; // This can be the filename or URL of the uploaded file

    @CreationTimestamp  // Automatically sets when first created
    @Column(updatable = false) // Prevents updates after creation
    private LocalDateTime createdAt;

    @UpdateTimestamp  // Updates automatically on each change
    private LocalDateTime updatedAt;

}

