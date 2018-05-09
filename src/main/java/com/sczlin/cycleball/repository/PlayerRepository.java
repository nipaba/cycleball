package com.sczlin.cycleball.repository;

import java.util.List;

import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.entity.PlayerEntity;

public interface PlayerRepository {

    Player findOne(String firstName, String surname);
    
    List<Player> findAll();

    void save(Player p1);

    void updatePlayerId(PlayerEntity player1);

}
