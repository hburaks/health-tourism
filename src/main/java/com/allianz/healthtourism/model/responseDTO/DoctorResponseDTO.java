package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.BaseResponseDTO;
import com.allianz.healthtourism.util.security.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class DoctorResponseDTO extends BaseResponseDTO {
    private HospitalResponseDTO hospital;
    private HealthCareServiceResponseDTO healthCareService;
    private List<ExaminationRecordResponseDTO> examinationRecords;
    private UserEntity user;
    private List<AppointmentResponseDTO> appointments;
}
