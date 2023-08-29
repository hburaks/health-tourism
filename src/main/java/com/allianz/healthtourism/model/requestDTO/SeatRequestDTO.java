package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import lombok.Data;

@Data
public class SeatRequestDTO extends BaseEntity {
    private int seatNo;
    private PatientRequestDTO patient;
}
