package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseResponseDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentResponseDTO extends BaseResponseDTO {
    private LocalDateTime appointmentDate;
    private PatientResponseDTO patient;
    private HospitalResponseDTO hospital;
    private DoctorResponseDTO doctor;
    private HealthCareServiceResponseDTO healthService;
}
