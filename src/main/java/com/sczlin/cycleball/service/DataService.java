package com.sczlin.cycleball.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.domain.Tournament;

@Service
public class DataService {

    public Player getPlayer() {

        Player p = new Player();
        p.setBirthDate(LocalDateTime.now());
        p.setName("Tomas");
        p.setSurname("Nesvadba");
        return p;
    }

    public Tournament getTournament() {

        Tournament t = new Tournament();
        t.setLegue("Extraliga");
        return t;
    }

}
