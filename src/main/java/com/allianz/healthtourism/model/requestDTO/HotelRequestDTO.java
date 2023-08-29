package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class HotelRequestDTO extends BaseRequestDTO {
    private String name;
    private BigDecimal price;
    private CityRequestDTO city;
    private List<PatientRequestDTO> patients;
    private List<BookingRequestDTO> bookings;
    private List<RoomRequestDTO> rooms;
}
