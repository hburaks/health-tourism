package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class HospitalRequestDTO extends BaseRequestDTO {
    private String name;
    private Long cityId;
}
