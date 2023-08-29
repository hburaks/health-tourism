package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class HospitalResponseDTO extends BaseResponseDTO {
    private String name;
    private CityResponseDTO city;
    private List<ExaminationRecordResponseDTO> examinationRecords;
    private List<PatientResponseDTO> patients;
    private List<DoctorResponseDTO> doctors;
    private List<HealthCareServiceResponseDTO> healthCareServices;
}
