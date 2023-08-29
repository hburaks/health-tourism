package com.allianz.healthtourism.controller;

import com.allianz.healthtourism.database.entity.CityEntity;
import com.allianz.healthtourism.database.entity.DoctorEntity;
import com.allianz.healthtourism.database.repository.CityRepository;
import com.allianz.healthtourism.database.repository.DoctorRepository;
import com.allianz.healthtourism.database.specification.CitySpecification;
import com.allianz.healthtourism.database.specification.DoctorSpecification;
import com.allianz.healthtourism.mapper.CityMapper;
import com.allianz.healthtourism.mapper.DoctorMapper;
import com.allianz.healthtourism.model.requestDTO.CityRequestDTO;
import com.allianz.healthtourism.model.requestDTO.DoctorRequestDTO;
import com.allianz.healthtourism.model.responseDTO.CityResponseDTO;
import com.allianz.healthtourism.model.responseDTO.DoctorResponseDTO;
import com.allianz.healthtourism.service.CityService;
import com.allianz.healthtourism.service.DoctorService;
import com.allianz.healthtourism.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
@RequiredArgsConstructor
public class DoctorController extends BaseController<DoctorRequestDTO,
        DoctorResponseDTO,
        DoctorEntity,
        DoctorMapper,
        DoctorRepository,
        DoctorSpecification,
        DoctorService> {
    private final DoctorService service;

    @Override
    protected DoctorService getService() {
        return service;
    }
}