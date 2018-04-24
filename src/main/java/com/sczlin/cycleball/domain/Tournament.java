package com.sczlin.cycleball.domain;

import java.util.List;

import lombok.Data;

public @Data class Tournament {

    private List<Match> matches;
    private List<Refferee> refferess;
    private String legue;
    private int round;
    private Place place;
}
