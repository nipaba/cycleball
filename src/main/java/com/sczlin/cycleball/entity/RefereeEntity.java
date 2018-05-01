package com.sczlin.cycleball.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_referee", schema = "public")
public @Data class RefereeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "surname")
    private String surname;
}
