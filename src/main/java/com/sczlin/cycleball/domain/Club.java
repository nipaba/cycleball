package com.sczlin.cycleball.domain;

import java.util.List;

import lombok.Data;

public @Data class Club {

    private List<Team> teams;
    private List<Refferee> refferees;
}
