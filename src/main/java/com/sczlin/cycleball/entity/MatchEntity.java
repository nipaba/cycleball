package com.sczlin.cycleball.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tb_match", schema = "public")
public @Data class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "round")
    private int round;

    @Column(name = "matchNo")
    private int matchNo;

    @OneToOne
    @JoinColumn(name = "fk_referee_id", nullable = false)
    private RefereeEntity referee;

    @OneToOne
    @JoinColumn(name = "fk_team_id_1", nullable = false)
    private TeamEntity team1;

    @OneToOne
    @JoinColumn(name = "fk_team_id_2", nullable = false)
    private TeamEntity team2;

    @Column(name = "score_team1")
    private int scoreTeam1;

    @Column(name = "score_team2")
    private int scoreTeam2;

    @Column(name = "half_score_team1")
    private int halfScoreTeam1;

    @Column(name = "half_score_team2")
    private int halfScoreTeam2;

}
