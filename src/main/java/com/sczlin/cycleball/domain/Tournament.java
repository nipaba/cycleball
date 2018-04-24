package com.sczlin.cycleball.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public @Data class Tournament {

    private List<Match> matches = new ArrayList<>();
    private List<Refferee> refferess = new ArrayList<>();
    private String legue;
    private int round;
    private Place place;
}
