package com.sczlin.cycleball.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public @Data class Club {
    
    private String clubName;
    private List<Team> teams = new ArrayList<>();
    private List<Referee> referees= new ArrayList<>();
}
