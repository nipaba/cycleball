package com.sczlin.cycleball.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_team", schema = "public")
public @Data class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "team_name")
    private String name;

    @OneToOne
    @JoinColumn(name = "fk_player_id_1", nullable = false)
    private PlayerEntity player1;
 
    @OneToOne
    @JoinColumn(name = "fk_player_id_2", nullable = false)
    private PlayerEntity player2;

    @OneToOne
    @JoinColumn(name = "fk_player_id_reserve", nullable = false)
    private PlayerEntity reservePlayer;

}
