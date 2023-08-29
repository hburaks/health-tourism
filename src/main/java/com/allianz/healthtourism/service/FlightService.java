package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.DoctorEntity;
import com.allianz.healthtourism.database.entity.FlightEntity;
import com.allianz.healthtourism.database.repository.DoctorRepository;
import com.allianz.healthtourism.database.repository.FlightRepository;
import com.allianz.healthtourism.database.specification.DoctorSpecification;
import com.allianz.healthtourism.database.specification.FlightSpecification;
import com.allianz.healthtourism.mapper.DoctorMapper;
import com.allianz.healthtourism.mapper.FlightMapper;
import com.allianz.healthtourism.model.requestDTO.DoctorRequestDTO;
import com.allianz.healthtourism.model.requestDTO.FlightRequestDTO;
import com.allianz.healthtourism.model.responseDTO.DoctorResponseDTO;
import com.allianz.healthtourism.model.responseDTO.FlightResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FlightService extends BaseService<FlightResponseDTO, FlightRequestDTO, FlightEntity, FlightMapper, FlightRepository, FlightSpecification> {
    private final FlightRepository repository;
    private final FlightSpecification specification;
    @Override
    protected FlightMapper getMapper() {
        return FlightMapper.INSTANCE;
    }
    @Override
    protected FlightRepository getRepository() {
        return repository;
    }
    @Override
    protected FlightSpecification getSpecification() {
        return specification;
    }
}
