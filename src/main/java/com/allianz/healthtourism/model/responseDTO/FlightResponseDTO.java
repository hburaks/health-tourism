package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.BaseResponseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class FlightResponseDTO extends BaseResponseDTO {
    private BigDecimal price;
    private LocalDateTime flightDate;
    private CityResponseDTO cityTo;
    private CityResponseDTO cityFrom;
    private PlaneResponseDTO plane;
    private List<PatientResponseDTO> patients;
}
