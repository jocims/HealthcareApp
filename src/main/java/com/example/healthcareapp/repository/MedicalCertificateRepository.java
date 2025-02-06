package com.example.healthcareapp.repository;

import com.example.healthcareapp.model.MedicalCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalCertificateRepository extends JpaRepository<MedicalCertificate, Long> {

}
