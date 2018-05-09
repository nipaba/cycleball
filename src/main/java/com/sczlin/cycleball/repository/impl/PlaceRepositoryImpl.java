package com.sczlin.cycleball.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.repository.PlaceRepository;
import com.sczlin.cycleball.repository.jpa.PlaceJpaRepository;

@Repository
public class PlaceRepositoryImpl implements PlaceRepository{

    @Autowired
    private PlaceJpaRepository jpa;
}
