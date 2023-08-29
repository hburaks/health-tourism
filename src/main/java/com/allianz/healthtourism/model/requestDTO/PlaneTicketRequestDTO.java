package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

@Data
public class PlaneTicketRequestDTO extends BaseRequestDTO {
    private FlightRequestDTO flight;
    private SeatRequestDTO seat;
    private PatientRequestDTO patient;
}
