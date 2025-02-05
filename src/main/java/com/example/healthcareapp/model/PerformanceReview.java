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
@Table(name = "performance_review")
public class PerformanceReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long performanceReviewId;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    private String reviewer; // The person conducting the review
    private int rating; // Rating score
    private String feedback; // Additional comments from the reviewer
    private LocalDate reviewDate;

    @CreationTimestamp  // Automatically sets when first created
    @Column(updatable = false) // Prevents updates after creation
    private LocalDateTime createdAt;

    @UpdateTimestamp  // Updates automatically on each change
    private LocalDateTime updatedAt;

    private LocalDate nextReminderDate; // Next reminder date

}
