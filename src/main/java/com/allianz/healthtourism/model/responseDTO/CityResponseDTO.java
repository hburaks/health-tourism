package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

@Data
public class CityResponseDTO extends BaseRequestDTO {
    private String name;
    private String country;
}
