package com.microsservice_db.Model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "furniture")
public class Furniture extends EntityModel { 

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private TypeEnum type;

        @Column
        private String material;

        @Column
        private String color;

        //private Dimensions;

        @Column
        private BigDecimal wheight;

        @Column
        private BigDecimal price;
        
        @Column
        private int amount;

        @Column
        private String description;

}
