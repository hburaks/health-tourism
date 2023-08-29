package com.allianz.healthtourism.model.requestDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class FlightRequestDTO extends BaseRequestDTO {
    private BigDecimal price;
    @Column(name = "flight_date")
    private LocalDateTime flightDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_to_id")
    private CityRequestDTO cityTo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_from_id")
    private CityRequestDTO cityFrom;
    @ManyToOne(fetch = FetchType.LAZY)
    private PlaneRequestDTO plane;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PatientRequestDTO> patients;
}
