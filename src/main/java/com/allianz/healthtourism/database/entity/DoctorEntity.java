package com.allianz.healthtourism.database.entity;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import com.allianz.healthtourism.util.security.UserEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity
@Data
public class DoctorEntity extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospital;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "health_care_service_id")
    private HealthCareServiceEntity healthCareService;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = "doctor")
    private List<ExaminationRecordEntity> examinationRecords;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UserEntity user;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "doctor")
    private List<AppointmentEntity> appointments;
}
