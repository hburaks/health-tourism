package com.allianz.healthtourism.database.repository;

import com.allianz.healthtourism.database.entity.PatientEntity;
import com.allianz.healthtourism.util.dbutil.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends BaseRepository<PatientEntity> {
}
