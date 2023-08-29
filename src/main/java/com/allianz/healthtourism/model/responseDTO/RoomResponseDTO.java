package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseResponseDTO;
import com.allianz.healthtourism.util.dbutil.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
public class RoomResponseDTO extends BaseResponseDTO {
    private int roomNo;
    private int bedCount;
    private List<PatientResponseDTO> patients;
}
