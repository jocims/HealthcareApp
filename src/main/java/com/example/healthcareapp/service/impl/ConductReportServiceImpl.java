package com.example.healthcareapp.service.impl;

import com.example.healthcareapp.model.ConductReport;
import com.example.healthcareapp.repository.ConductReportRepository;
import com.example.healthcareapp.service.ConductReportService;
import org.springframework.stereotype.Service;

@Service
public class ConductReportServiceImpl extends GenericServiceImpl<ConductReport, Long> implements ConductReportService {

    public ConductReportServiceImpl(ConductReportRepository repository) {
        super(repository);
    }
}
