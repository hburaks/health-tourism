package com.allianz.healthtourism.database.entity;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class ExaminationRecordEntity extends BaseEntity {
    private String notes;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private AppointmentEntity appointment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor")
    private DoctorEntity doctor;
}
