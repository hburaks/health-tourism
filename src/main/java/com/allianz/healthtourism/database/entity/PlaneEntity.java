package com.allianz.healthtourism.database.entity;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Entity
@Data
public class PlaneEntity extends BaseEntity {
    private String name;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<SeatEntity> seats;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "plane")
    private CityEntity city;
}
