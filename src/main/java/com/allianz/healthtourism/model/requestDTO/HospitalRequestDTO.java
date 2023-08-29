package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class HospitalRequestDTO extends BaseRequestDTO {
    private String name;
    private CityRequestDTO city;
    private List<ExaminationRecordRequestDTO> examinationRecords;
    private List<PatientRequestDTO> patients;
    private List<DoctorRequestDTO> doctors;
    private List<HealthCareServiceRequestDTO> healthCareServices;
}
