package com.sczlin.cycleball.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.repository.RefereeRepository;
import com.sczlin.cycleball.repository.jpa.RefereeJpaRepository;

@Repository
public class RefereeRepositoryImpl implements RefereeRepository{

    @Autowired
    private RefereeJpaRepository jpa;
}
