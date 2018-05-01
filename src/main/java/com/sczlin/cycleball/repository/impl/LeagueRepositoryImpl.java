package com.sczlin.cycleball.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sczlin.cycleball.domain.League;
import com.sczlin.cycleball.entity.LeagueEntity;
import com.sczlin.cycleball.repository.LeagueRepository;
import com.sczlin.cycleball.repository.jpa.LeagueJpaRepository;

import ma.glasnost.orika.MapperFacade;

@Service
public class LeagueRepositoryImpl implements LeagueRepository {

    @Autowired
    private LeagueJpaRepository jpa;

    @Autowired
    private MapperFacade mapper;

    /* (non-Javadoc)
     * @see com.sczlin.cycleball.repository.LeagueRepository#findAll()
     */
    @Override
    public List<League> findAll() {

        List<LeagueEntity> leaguesEnities = jpa.findAll();
        List<League> leagues = mapper.mapAsList(leaguesEnities, League.class);

        return leagues;
    }

    /* (non-Javadoc)
     * @see com.sczlin.cycleball.repository.LeagueRepository#findOne(java.lang.String)
     */
    @Override
    public League findOne(String name) {
        LeagueEntity leagueEntity = jpa.findOneByName(name);

        League league = mapper.map(leagueEntity, League.class);

        return league;
    }

    /* (non-Javadoc)
     * @see com.sczlin.cycleball.repository.LeagueRepository#save(com.sczlin.cycleball.domain.League)
     */
    @Override
    public void save(League league) {
        LeagueEntity leagueEntity = mapper.map(league, LeagueEntity.class);
        jpa.save(leagueEntity);
    }

}
