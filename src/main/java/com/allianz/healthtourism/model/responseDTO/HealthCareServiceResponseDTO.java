package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HealthCareServiceResponseDTO extends BaseRequestDTO {
    private String name;
    private BigDecimal price;
}
