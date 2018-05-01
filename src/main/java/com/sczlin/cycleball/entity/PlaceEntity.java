package com.sczlin.cycleball.entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_place", schema = "public")
public @Data class PlaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "address")
    private String address;

}
