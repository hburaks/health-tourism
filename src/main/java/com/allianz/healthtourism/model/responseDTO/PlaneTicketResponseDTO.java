package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseResponseDTO;
import com.allianz.healthtourism.util.dbutil.BaseEntity;
import lombok.Data;

@Data
public class PlaneTicketResponseDTO extends BaseResponseDTO {
    private FlightResponseDTO flight;
    private SeatResponseDTO seat;
    private PatientResponseDTO patient;
}
