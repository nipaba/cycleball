package com.sczlin.cycleball.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sczlin.cycleball.domain.Club;
import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.entity.ClubEntity;
import com.sczlin.cycleball.entity.PlayerEntity;
import com.sczlin.cycleball.repository.PlayerRepository;
import com.sczlin.cycleball.repository.jpa.PlayerJpaRepository;

import ma.glasnost.orika.MapperFacade;

@Service
public class PlayerRepositoryImpl implements PlayerRepository {

    @Autowired
    private MapperFacade mapper;

    @Autowired
    private PlayerJpaRepository jpa;

    @Override
    public Player findOne(String firstName, String surname) {
        PlayerEntity playerEntity = jpa.findOneByFirstnameAndSurname(firstName, surname);
        return mapper.map(playerEntity, Player.class);

    }

    @Override
    public void save(Player player) {
        PlayerEntity playerEntity = mapper.map(player, PlayerEntity.class);
        jpa.save(playerEntity);
    }

    @Override
    public void updatePlayerId(PlayerEntity player) {

        PlayerEntity foundPlayer = jpa.findOneByFirstnameAndSurname(player.getFirstname(), player.getSurname());
        player.setId(foundPlayer.getId());
    }

    @Override
    public List<Player> findAll() {
        List<PlayerEntity> playerEntities = jpa.findAll();
        return mapper.mapAsList(playerEntities, Player.class);
    }
}
