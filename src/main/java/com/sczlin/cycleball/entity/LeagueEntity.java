package com.sczlin.cycleball.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_league", schema = "public")
public @Data class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

}
