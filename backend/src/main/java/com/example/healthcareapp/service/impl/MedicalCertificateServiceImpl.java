package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.MedicalCertificate;
import com.example.healthcareapp.repository.MedicalCertificateRepository;
import com.example.healthcareapp.service.MedicalCertificateService;
import org.springframework.stereotype.Service;

@Service
public class MedicalCertificateServiceImpl extends GenericServiceImpl<MedicalCertificate, Long> implements MedicalCertificateService {

    public MedicalCertificateServiceImpl(MedicalCertificateRepository repository) {
        super(repository);
    }
}
