package com.sczlin.cycleball.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_tournament", schema = "public")
public class TournamentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
}
