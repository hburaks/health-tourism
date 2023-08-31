package com.allianz.healthtourism.database.entity;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity
@Data
public class RoomEntity extends BaseEntity {
    private int roomNo;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<PatientEntity> patients;
}
