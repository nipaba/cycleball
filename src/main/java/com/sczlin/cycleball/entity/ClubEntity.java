package com.sczlin.cycleball.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_club", schema = "public")
public @Data class ClubEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "name")
    private String name;

}
