package com.sczlin.cycleball.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_player", schema = "public")
public @Data class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "birthdate")
    private LocalDateTime birthdate;

    @Column
    @OneToMany(mappedBy = "player")
    private List<LicenceEntity> licences = new ArrayList<>();

}
