package com.sczlin.cycleball.domain;

import lombok.Data;

public @Data class Team {

    private Player player1;
    private Player player2;

    private Player reservePlayer;

}
