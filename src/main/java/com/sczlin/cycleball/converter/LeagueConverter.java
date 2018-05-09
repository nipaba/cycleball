package com.sczlin.cycleball.converter;

import org.springframework.stereotype.Component;

import com.sczlin.cycleball.domain.League;
import com.sczlin.cycleball.entity.LeagueEntity;

import ma.glasnost.orika.MapperFactory;

@Component
public class LeagueConverter implements AbstractConverter {

    @Override
    public void addConversions(MapperFactory mapperFactory) {
        mapperFactory.classMap(LeagueEntity.class, League.class)
                .field("name", "name")
                .register();
    }

}
