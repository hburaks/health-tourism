package com.allianz.healthtourism.controller;

import com.allianz.healthtourism.database.entity.FlightEntity;
import com.allianz.healthtourism.database.entity.HospitalEntity;
import com.allianz.healthtourism.database.repository.FlightRepository;
import com.allianz.healthtourism.database.repository.HospitalRepository;
import com.allianz.healthtourism.database.specification.FlightSpecification;
import com.allianz.healthtourism.database.specification.HospitalSpecification;
import com.allianz.healthtourism.mapper.FlightMapper;
import com.allianz.healthtourism.mapper.HospitalMapper;
import com.allianz.healthtourism.model.requestDTO.FlightRequestDTO;
import com.allianz.healthtourism.model.requestDTO.HospitalRequestDTO;
import com.allianz.healthtourism.model.responseDTO.FlightResponseDTO;
import com.allianz.healthtourism.model.responseDTO.HospitalResponseDTO;
import com.allianz.healthtourism.service.FlightService;
import com.allianz.healthtourism.service.HospitalService;
import com.allianz.healthtourism.util.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("hospital")
@RequiredArgsConstructor
public class HospitalController extends BaseController<HospitalRequestDTO, HospitalResponseDTO, HospitalEntity, HospitalMapper, HospitalRepository, HospitalSpecification, HospitalService> {
    private final HospitalService service;

    @Override
    protected HospitalService getService() {
        return service;
    }


    @PostMapping("{healthCareServiceUuid}/addTo/{hospitalUuid}")
    public ResponseEntity<HospitalResponseDTO> addHealthCareServiceToHospital(@PathVariable UUID healthCareServiceUuid,
                                                  @PathVariable UUID hospitalUuid) {
        try {
            HospitalResponseDTO responseDTO = getService().addHealthCareServiceToHospital(healthCareServiceUuid, hospitalUuid);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
