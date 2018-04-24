package com.sczlin.cycleball.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public @Data class League {

    private String name;
    private List<Tournament> tournaments = new ArrayList<>();
}
