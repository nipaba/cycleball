package com.sczlin.cycleball.domain;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

public @Data class Player {

    private String name;
    private String surname;

    private LocalDateTime birthDate;

    private Map<Integer, Licence> licences = new HashMap<>();
}
