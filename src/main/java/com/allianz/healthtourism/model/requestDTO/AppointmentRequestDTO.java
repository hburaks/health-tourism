package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentRequestDTO extends BaseRequestDTO {
    private LocalDateTime appointmentDate;
    private PatientRequestDTO patient;
    private HospitalRequestDTO hospital;
    private DoctorRequestDTO doctor;
    private HealthCareServiceRequestDTO healthService;
}
