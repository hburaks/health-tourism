package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.security.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class DoctorRequestDTO extends BaseRequestDTO {
    private HospitalRequestDTO hospital;
    private HealthCareServiceRequestDTO healthCareService;
    private List<ExaminationRecordRequestDTO> examinationRecords;
    private UserEntity user;
    private List<AppointmentRequestDTO> appointments;
}
