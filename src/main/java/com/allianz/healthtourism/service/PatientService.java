package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.HotelEntity;
import com.allianz.healthtourism.database.entity.PatientEntity;
import com.allianz.healthtourism.database.repository.HotelRepository;
import com.allianz.healthtourism.database.repository.PatientRepository;
import com.allianz.healthtourism.database.specification.HotelSpecification;
import com.allianz.healthtourism.database.specification.PatientSpecification;
import com.allianz.healthtourism.mapper.HotelMapper;
import com.allianz.healthtourism.mapper.PatientMapper;
import com.allianz.healthtourism.model.requestDTO.HotelRequestDTO;
import com.allianz.healthtourism.model.requestDTO.PatientRequestDTO;
import com.allianz.healthtourism.model.responseDTO.HotelResponseDTO;
import com.allianz.healthtourism.model.responseDTO.PatientResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PatientService extends BaseService<PatientResponseDTO, PatientRequestDTO, PatientEntity, PatientMapper, PatientRepository, PatientSpecification> {
    private final PatientRepository repository;
    private final PatientSpecification specification;

    @Override
    protected PatientMapper getMapper() {
        return PatientMapper.INSTANCE;
    }

    @Override
    protected PatientRepository getRepository() {
        return repository;
    }

    @Override
    protected PatientSpecification getSpecification() {
        return specification;
    }
}
