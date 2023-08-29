package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.BaseResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BookingResponseDTO extends BaseResponseDTO {
    private BigDecimal price;
    private LocalDateTime appointmentDate;
    private HotelResponseDTO hotel;
    private PatientResponseDTO patient;
    private RoomResponseDTO room;
}
