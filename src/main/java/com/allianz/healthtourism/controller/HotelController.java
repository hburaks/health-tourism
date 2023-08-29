package com.allianz.healthtourism.controller;

import com.allianz.healthtourism.database.entity.HotelEntity;
import com.allianz.healthtourism.database.repository.HotelRepository;
import com.allianz.healthtourism.database.specification.HotelSpecification;
import com.allianz.healthtourism.mapper.HotelMapper;
import com.allianz.healthtourism.model.requestDTO.HotelRequestDTO;
import com.allianz.healthtourism.model.responseDTO.HotelResponseDTO;
import com.allianz.healthtourism.service.HotelService;
import com.allianz.healthtourism.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hotel")
@RequiredArgsConstructor
public class HotelController extends BaseController<HotelRequestDTO, HotelResponseDTO, HotelEntity, HotelMapper, HotelRepository, HotelSpecification, HotelService> {
    private final HotelService service;

    @Override
    protected HotelService getService() {
        return service;
    }
}
