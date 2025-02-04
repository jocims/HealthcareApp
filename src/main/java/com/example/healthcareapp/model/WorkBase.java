package com.example.healthcareapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor  // ✅ This is required by Hibernate!
@AllArgsConstructor
@Entity
@Table(name="work_base")
public class WorkBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workBaseId;
    private int workBaseNumber;
    private String location;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
