package com.sczlin.cycleball.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public @Data class Tournament {

    private List<Match> matches = new ArrayList<>();
    private List<Referee> refferess = new ArrayList<>();
    private int round;
    private Place place;
}
