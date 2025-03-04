//WorkBaseRepository.java

package com.example.healthcareapp.repository;

import com.example.healthcareapp.model.WorkBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkBaseRepository extends JpaRepository <WorkBase, Integer> {
    // You can add WorkBase-specific methods here if needed
}
