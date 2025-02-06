package com.example.healthcareapp.controller;

import com.example.healthcareapp.model.MedicalCertificate;
import com.example.healthcareapp.service.MedicalCertificateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalcertificate")
public class MedicalCertificateAPIController {

    private final MedicalCertificateService medicalCertificateService;

    public MedicalCertificateAPIController(MedicalCertificateService medicalCertificateService) {
        this.medicalCertificateService = medicalCertificateService;
    }

    @GetMapping("{id}")
    public MedicalCertificate getMedicalCertificate(@PathVariable("id") Long id) {
        return medicalCertificateService.getById(id);
    }

    @GetMapping
    public List<MedicalCertificate> getAllMedicalCertificates() {
        return medicalCertificateService.getAll();
    }

    @PostMapping
    public String createMedicalCertificate(@RequestBody MedicalCertificate medicalCertificate) {
        medicalCertificateService.save(medicalCertificate);
        return "Medical Certificate Created Successfully";
    }

    @PutMapping
    public String updateMedicalCertificate(@RequestBody MedicalCertificate medicalCertificate) {
        medicalCertificateService.save(medicalCertificate);
        return "Medical Certificate Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteMedicalCertificate(@PathVariable("id") Long id) {
        medicalCertificateService.delete(id);
        return "Medical Certificate Deleted Successfully";
    }
}
