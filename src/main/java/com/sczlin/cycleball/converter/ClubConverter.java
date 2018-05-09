package com.sczlin.cycleball.converter;

import org.springframework.stereotype.Component;

import com.sczlin.cycleball.domain.Club;
import com.sczlin.cycleball.entity.ClubEntity;

import ma.glasnost.orika.MapperFactory;

@Component
public class ClubConverter implements AbstractConverter {

    @Override
    public void addConversions(MapperFactory mapperFactory) {
        mapperFactory.classMap(ClubEntity.class, Club.class)
                .field("name", "clubName")
                .register();
    }
}
