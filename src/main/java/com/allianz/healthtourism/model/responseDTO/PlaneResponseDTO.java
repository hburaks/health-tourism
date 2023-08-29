package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class PlaneResponseDTO extends BaseRequestDTO {
    private String name;
    private List<SeatResponseDTO> seats;
    private CityResponseDTO city;
}
