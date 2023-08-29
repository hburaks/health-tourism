package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.AppointmentEntity;
import com.allianz.healthtourism.database.entity.BookingEntity;
import com.allianz.healthtourism.database.repository.AppointmentRepository;
import com.allianz.healthtourism.database.repository.BookingRepository;
import com.allianz.healthtourism.database.specification.AppointmentSpecification;
import com.allianz.healthtourism.database.specification.BookingSpecification;
import com.allianz.healthtourism.mapper.AppointmentMapper;
import com.allianz.healthtourism.mapper.BookingMapper;
import com.allianz.healthtourism.model.requestDTO.AppointmentRequestDTO;
import com.allianz.healthtourism.model.requestDTO.BookingRequestDTO;
import com.allianz.healthtourism.model.responseDTO.AppointmentResponseDTO;
import com.allianz.healthtourism.model.responseDTO.BookingResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BookingService extends BaseService<BookingResponseDTO, BookingRequestDTO, BookingEntity, BookingMapper, BookingRepository, BookingSpecification> {
    private final BookingRepository repository;
    private final BookingSpecification specification;
    @Override
    protected BookingMapper getMapper() {
        return BookingMapper.INSTANCE;
    }
    @Override
    protected BookingRepository getRepository() {
        return repository;
    }
    @Override
    protected BookingSpecification getSpecification() {
        return specification;
    }
}
