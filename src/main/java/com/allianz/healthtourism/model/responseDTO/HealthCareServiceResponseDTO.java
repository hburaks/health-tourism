package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.BaseResponseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HealthCareServiceResponseDTO extends BaseResponseDTO {
    private String name;
    private BigDecimal price;
}
