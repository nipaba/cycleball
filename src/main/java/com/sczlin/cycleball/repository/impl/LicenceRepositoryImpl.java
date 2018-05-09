package com.sczlin.cycleball.repository.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.domain.Licence;
import com.sczlin.cycleball.entity.LicenceEntity;
import com.sczlin.cycleball.entity.PlayerEntity;
import com.sczlin.cycleball.repository.LicenceRepository;
import com.sczlin.cycleball.repository.jpa.LicenceJpaRepository;
import com.sczlin.cycleball.repository.jpa.PlayerJpaRepository;

import ma.glasnost.orika.MapperFacade;

@Repository
public class LicenceRepositoryImpl implements LicenceRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(LicenceRepositoryImpl.class);

    @Autowired
    private LicenceJpaRepository jpa;

    @Autowired
    private PlayerJpaRepository playerJpa;

    @Autowired
    private MapperFacade mapper;

    @Override
    public void save(Licence licence) {
        // TODO - TNES - REMOVE
        LOGGER.info("XXX " + licence);

        LicenceEntity licenceEntity = mapper.map(licence, LicenceEntity.class);

        PlayerEntity playerEntity = playerJpa.findOneByFirstnameAndSurname(licence.getPlayer().getFirstname(),
                licence.getPlayer().getSurname());
        licenceEntity.setPlayer(playerEntity);

        jpa.save(licenceEntity);
    }

    @Override
    public List<Licence> findAll() {
        return mapper.mapAsList(jpa.findAll(), Licence.class);
    }

}
