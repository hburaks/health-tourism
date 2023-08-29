package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

@Data
public class CityRequestDTO extends BaseRequestDTO {
    private String name;
    private String country;
}
