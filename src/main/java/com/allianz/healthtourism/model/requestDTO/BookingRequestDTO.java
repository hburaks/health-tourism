package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BookingRequestDTO extends BaseRequestDTO {
    private BigDecimal price;
    private LocalDateTime appointmentDate;
    private HotelRequestDTO hotel;
    private PatientRequestDTO patient;
    private RoomRequestDTO room;
}
