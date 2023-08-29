package com.allianz.healthtourism.database.repository;

import com.allianz.healthtourism.database.entity.AppointmentEntity;
import com.allianz.healthtourism.util.dbutil.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends BaseRepository<AppointmentEntity> {
}
