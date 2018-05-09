package com.sczlin.cycleball.repository;

import java.util.List;

import com.sczlin.cycleball.domain.Club;

public interface ClubRepository {

    List<Club> findAll();

    Club findOne(String name);

    void save(Club club);

}
