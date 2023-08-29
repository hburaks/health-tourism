package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.HealthCareServiceEntity;
import com.allianz.healthtourism.database.entity.HospitalEntity;
import com.allianz.healthtourism.database.repository.HealthCareServiceRepository;
import com.allianz.healthtourism.database.repository.HospitalRepository;
import com.allianz.healthtourism.database.specification.HealthCareServiceSpecification;
import com.allianz.healthtourism.database.specification.HospitalSpecification;
import com.allianz.healthtourism.mapper.HealthCareServiceMapper;
import com.allianz.healthtourism.mapper.HospitalMapper;
import com.allianz.healthtourism.model.requestDTO.HealthCareServiceRequestDTO;
import com.allianz.healthtourism.model.requestDTO.HospitalRequestDTO;
import com.allianz.healthtourism.model.responseDTO.HealthCareServiceResponseDTO;
import com.allianz.healthtourism.model.responseDTO.HospitalResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class HospitalService extends BaseService<HospitalResponseDTO, HospitalRequestDTO, HospitalEntity, HospitalMapper, HospitalRepository, HospitalSpecification> {
    private final HospitalRepository repository;
    private final HospitalSpecification specification;
    @Override
    protected HospitalMapper getMapper() {
        return HospitalMapper.INSTANCE;
    }
    @Override
    protected HospitalRepository getRepository() {
        return repository;
    }
    @Override
    protected HospitalSpecification getSpecification() {
        return specification;
    }
}
