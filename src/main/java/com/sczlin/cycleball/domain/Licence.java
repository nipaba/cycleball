package com.sczlin.cycleball.domain;

import lombok.Data;

public @Data class Licence {

    private int year;
    private String number;
    private Player player;
}
