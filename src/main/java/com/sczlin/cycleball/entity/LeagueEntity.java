package com.sczlin.cycleball.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_league", schema = "public")
public class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
}
