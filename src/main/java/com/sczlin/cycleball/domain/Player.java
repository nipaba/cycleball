package com.sczlin.cycleball.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

public @Data class Player {

    private String name;
    private String surname;

    private LocalDateTime birthdate;

    private List<Licence> licences = new ArrayList<>();
}
