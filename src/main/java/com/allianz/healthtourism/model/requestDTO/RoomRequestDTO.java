package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
public class RoomRequestDTO extends BaseEntity {
    private int roomNo;
    private int bedCount;
    private List<PatientRequestDTO> patients;
}
