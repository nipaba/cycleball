package com.sczlin.cycleball.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sczlin.cycleball.converter.*;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
public class ConverterConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConverterConfig.class);

    @Autowired
    private LeagueConverter leagueConverter;

    @Autowired
    private PlayerConverter playerConverter;

    @Autowired
    private ClubConverter clubConverter;

    @Autowired
    private LicenceConverter licenceConverter;

    @Autowired
    private MatchConverter matchConverter;

    @Autowired
    private PlaceConverter placeConverter;

    @Autowired
    private RefereeConverter refereeConverter;

    @Autowired
    private TeamConverter teamConverter;

    @Autowired
    private TournamentConverter tournamentConverter;
    

    @Bean
    public MapperFactory getMapperFactory() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        // TODO - TNES - REMOVE
        LOGGER.info("XXX " + "Converters created !");

        leagueConverter.addConversions(mapperFactory);
        playerConverter.addConversions(mapperFactory);
        clubConverter.addConversions(mapperFactory);
        tournamentConverter.addConversions(mapperFactory);
        matchConverter.addConversions(mapperFactory);
        placeConverter.addConversions(mapperFactory);
        refereeConverter.addConversions(mapperFactory);
        licenceConverter.addConversions(mapperFactory);
        teamConverter.addConversions(mapperFactory);

        
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        converterFactory.registerConverter("dateToString", new DateToStringConverter());
        converterFactory.registerConverter("stringToDate", new DateToStringConverter());
        converterFactory.registerConverter("dateToDate", new LocalDateTimeToLocalDateTimeConverter());

        return mapperFactory;
    }

    @Bean
    public MapperFacade getMapperFacade() {
        return getMapperFactory().getMapperFacade();
    }

}
