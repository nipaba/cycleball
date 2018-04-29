package com.sczlin.cycleball.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_licence",schema = "public")
public @Data class LicenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "year")
    private int year;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_player")
    private PlayerEntity player;
    
}