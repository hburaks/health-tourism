package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.HotelEntity;
import com.allianz.healthtourism.database.repository.HotelRepository;
import com.allianz.healthtourism.database.specification.HotelSpecification;
import com.allianz.healthtourism.mapper.HospitalMapper;
import com.allianz.healthtourism.mapper.HotelMapper;
import com.allianz.healthtourism.model.requestDTO.HotelRequestDTO;
import com.allianz.healthtourism.model.responseDTO.HotelResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class HotelService extends BaseService<HotelResponseDTO, HotelRequestDTO, HotelEntity, HotelMapper, HotelRepository, HotelSpecification> {
    private final HotelRepository repository;
    private final HotelSpecification specification;

    @Override
    protected HotelMapper getMapper() {
        return HotelMapper.INSTANCE;
    }

    @Override
    protected HotelRepository getRepository() {
        return repository;
    }

    @Override
    protected HotelSpecification getSpecification() {
        return specification;
    }
}
