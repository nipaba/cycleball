package com.sczlin.cycleball.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.domain.Club;
import com.sczlin.cycleball.domain.Team;
import com.sczlin.cycleball.entity.ClubEntity;
import com.sczlin.cycleball.entity.TeamEntity;
import com.sczlin.cycleball.repository.PlayerRepository;
import com.sczlin.cycleball.repository.TeamRepository;
import com.sczlin.cycleball.repository.jpa.TeamJpaRepository;

import ma.glasnost.orika.MapperFacade;

@Repository
public class TeamRepositoryImpl implements TeamRepository {
    
    @Autowired
    private PlayerRepository playerRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamRepositoryImpl.class);
    @Autowired
    private MapperFacade mapper;

    @Autowired
    private TeamJpaRepository jpa;

    @Override
    public void save(Team team) {
        TeamEntity teamEntity = mapper.map(team, TeamEntity.class);
        playerRepository.updatePlayerId(teamEntity.getPlayer1());
        playerRepository.updatePlayerId(teamEntity.getPlayer2());
        playerRepository.updatePlayerId(teamEntity.getReservePlayer());
         jpa.save(teamEntity);
    }
}
