package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import lombok.Data;

@Data
public class SeatResponseDTO extends BaseEntity {
    private int seatNo;
    private PatientResponseDTO patient;
}
