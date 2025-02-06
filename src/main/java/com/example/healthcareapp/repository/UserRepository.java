//UserRepository.java

package com.example.healthcareapp.repository;

import com.example.healthcareapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add User-specific methods here if needed
}
