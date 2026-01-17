package com.pm.patient_service.service;

import com.pm.patient_service.dto.PatientResponseDto;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepo;

//    logic to get patients list
    public List<PatientResponseDto> getPatients(){

//       first get all patients from patientRepo(entity)
        List<Patient> patients=patientRepo.findAll();

//       convert it to dto response
        List<PatientResponseDto> patientResponseDtos=patients.stream()
                .map(patient -> PatientMapper.toDto(patient)).toList();
//        return to client
        return patientResponseDtos;
    }
}
