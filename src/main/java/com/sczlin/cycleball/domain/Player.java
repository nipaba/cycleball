package com.sczlin.cycleball.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public @Data class Player {

    private String firstname;
    private String surname;

    private LocalDateTime birthdate;

    private List<Licence> licences = new ArrayList<>();
}
