package com.pm.patient_service.controller;

import com.pm.patient_service.dto.PatientResponseDto;
import com.pm.patient_service.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientResponseDto>> getPatient(){
        List<PatientResponseDto> patients= patientService.getPatients();
        return ResponseEntity.ok().body(patients);
    }
}
