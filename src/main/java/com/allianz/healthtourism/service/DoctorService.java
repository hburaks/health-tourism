package com.allianz.healthtourism.service;

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
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DoctorService extends BaseService<DoctorResponseDTO, DoctorRequestDTO, DoctorEntity, DoctorMapper, DoctorRepository, DoctorSpecification> {
    private final DoctorRepository repository;
    private final DoctorSpecification specification;
    @Override
    protected DoctorMapper getMapper() {
        return DoctorMapper.INSTANCE;
    }
    @Override
    protected DoctorRepository getRepository() {
        return repository;
    }
    @Override
    protected DoctorSpecification getSpecification() {
        return specification;
    }
}
