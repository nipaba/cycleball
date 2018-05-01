package com.sczlin.cycleball.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sczlin.cycleball.domain.League;
import com.sczlin.cycleball.entity.LeagueEntity;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
public class ConverterConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConverterConfig.class);

    @Bean
    public MapperFactory getMapperFactory() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        // TODO - TNES - REMOVE
        LOGGER.info("XXX " + "Converters created !");

        mapperFactory.classMap(LeagueEntity.class, League.class)
                .field("name", "name")
                .register();

        return mapperFactory;
    }

    @Bean
    public MapperFacade getMapperFacade() {
        return getMapperFactory().getMapperFacade();
    }

}
