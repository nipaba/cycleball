package com.sczlin.cycleball.repository;

import java.util.List;

import com.sczlin.cycleball.domain.League;

public interface LeagueRepository {

    List<League> findAll();

    League findOne(String name);

    void save(League league);

}