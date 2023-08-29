package com.allianz.healthtourism.service;

import com.allianz.healthtourism.database.entity.ExaminationRecordEntity;
import com.allianz.healthtourism.database.entity.FlightEntity;
import com.allianz.healthtourism.database.repository.ExaminationRecordRepository;
import com.allianz.healthtourism.database.repository.FlightRepository;
import com.allianz.healthtourism.database.specification.ExaminationRecordSpecification;
import com.allianz.healthtourism.database.specification.FlightSpecification;
import com.allianz.healthtourism.mapper.ExaminationRecordMapper;
import com.allianz.healthtourism.mapper.FlightMapper;
import com.allianz.healthtourism.model.requestDTO.ExaminationRecordRequestDTO;
import com.allianz.healthtourism.model.requestDTO.FlightRequestDTO;
import com.allianz.healthtourism.model.responseDTO.ExaminationRecordResponseDTO;
import com.allianz.healthtourism.model.responseDTO.FlightResponseDTO;
import com.allianz.healthtourism.util.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ExaminationRecordService extends BaseService<ExaminationRecordResponseDTO, ExaminationRecordRequestDTO, ExaminationRecordEntity, ExaminationRecordMapper, ExaminationRecordRepository, ExaminationRecordSpecification> {
    private final ExaminationRecordRepository repository;
    private final ExaminationRecordSpecification specification;
    @Override
    protected ExaminationRecordMapper getMapper() {
        return ExaminationRecordMapper.INSTANCE;
    }
    @Override
    protected ExaminationRecordRepository getRepository() {
        return repository;
    }
    @Override
    protected ExaminationRecordSpecification getSpecification() {
        return specification;
    }
}
