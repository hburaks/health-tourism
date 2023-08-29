package com.allianz.healthtourism.database.entity;

import com.allianz.healthtourism.util.dbutil.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Table
@Entity
@Data
public class HealthCareServiceEntity extends BaseEntity {
   private String name;
   private BigDecimal price;
}
