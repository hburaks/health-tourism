package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

@Data
public class ExaminationRecordResponseDTO extends BaseRequestDTO {
    private String notes;
    private AppointmentResponseDTO appointment;
}
