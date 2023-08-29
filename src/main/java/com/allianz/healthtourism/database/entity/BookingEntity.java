package com.allianz.healthtourism.database.entity;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table
@Entity
@Data
public class BookingEntity extends BaseEntity {
    private BigDecimal price;
    @Column(name = "appointment_date")
    private LocalDateTime appointmentDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private RoomEntity room;
}
