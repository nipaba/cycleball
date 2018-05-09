package com.sczlin.cycleball.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.domain.Club;
import com.sczlin.cycleball.entity.ClubEntity;
import com.sczlin.cycleball.repository.ClubRepository;
import com.sczlin.cycleball.repository.jpa.ClubJpaRepository;

import ma.glasnost.orika.MapperFacade;

@Repository
public class ClubRepositoryImpl implements ClubRepository {

    @Autowired
    private ClubJpaRepository jpa;

    @Autowired
    private MapperFacade mapper;

    @Override
    public List<Club> findAll() {

        List<ClubEntity> clubsEntities = jpa.findAll();
        List<Club> clubs = mapper.mapAsList(clubsEntities, Club.class);

        return clubs;
    }

    @Override
    public Club findOne(String name) {
        ClubEntity clubEntity = jpa.findOneByName(name);

        Club club = mapper.map(clubEntity, Club.class);

        return club;
    }

    @Override
    public void save(Club club) {
        ClubEntity clubEntity = mapper.map(club, ClubEntity.class);
        jpa.save(clubEntity);
    }

}
