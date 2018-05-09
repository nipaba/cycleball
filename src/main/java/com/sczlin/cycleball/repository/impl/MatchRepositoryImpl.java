package com.sczlin.cycleball.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.repository.MatchRepository;
import com.sczlin.cycleball.repository.jpa.MatchJpaRepository;

@Repository
public class MatchRepositoryImpl implements MatchRepository{
    
    @Autowired
    private MatchJpaRepository jpa;
}
