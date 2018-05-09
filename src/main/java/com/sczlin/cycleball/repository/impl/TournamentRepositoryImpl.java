package com.sczlin.cycleball.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.repository.TournamentRepository;
import com.sczlin.cycleball.repository.jpa.TournamentJpaRepository;

@Repository
public class TournamentRepositoryImpl implements TournamentRepository {

    @Autowired
    private TournamentJpaRepository jpa;
}
