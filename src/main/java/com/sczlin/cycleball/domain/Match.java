package com.sczlin.cycleball.domain;

import lombok.Data;

public @Data class Match {
    
    private int round;
    private int matchNo;

    private Referee referee;

    private Team team1;
    private Team team2;

    private int scoreTeam1;
    private int scoreTeam2;

    private int halfScoreTeam1;
    private int halfScoreTeam2;

}
