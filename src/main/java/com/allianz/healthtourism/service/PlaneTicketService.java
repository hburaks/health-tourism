package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.PlaneTicketEntity;
import com.allianz.healthtourism.database.repository.PlaneTicketRepository;
import com.allianz.healthtourism.database.specification.PlaneTicketSpecification;
import com.allianz.healthtourism.mapper.PlaneTicketMapper;
import com.allianz.healthtourism.model.requestDTO.PlaneTicketRequestDTO;
import com.allianz.healthtourism.model.responseDTO.PlaneTicketResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PlaneTicketService extends BaseService<PlaneTicketResponseDTO, PlaneTicketRequestDTO, PlaneTicketEntity, PlaneTicketMapper, PlaneTicketRepository, PlaneTicketSpecification> {
    private final PlaneTicketRepository repository;
    private final PlaneTicketSpecification specification;

    @Override
    protected PlaneTicketMapper getMapper() {
        return PlaneTicketMapper.INSTANCE;
    }

    @Override
    protected PlaneTicketRepository getRepository() {
        return repository;
    }

    @Override
    protected PlaneTicketSpecification getSpecification() {
        return specification;
    }
}
