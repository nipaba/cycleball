package com.sczlin.cycleball.converter;

import org.springframework.stereotype.Component;

import com.sczlin.cycleball.domain.Team;
import com.sczlin.cycleball.entity.TeamEntity;

import ma.glasnost.orika.MapperFactory;

@Component
public class TeamConverter implements AbstractConverter {

    @Override
    public void addConversions(MapperFactory mapperFactory) {

        mapperFactory.classMap(TeamEntity.class, Team.class)
                .field("player1", "player1")
                .field("player2", "player2")
                .field("reservePlayer", "reservePlayer")
                .field("name", "name")
                .register();

    }

}
