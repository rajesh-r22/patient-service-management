package com.pm.patient_service.service;

import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepo;

    public List<PatientResponseDto> getpatients(){
        List<Patient> patients=patientRepo.findAll();
    }
}
