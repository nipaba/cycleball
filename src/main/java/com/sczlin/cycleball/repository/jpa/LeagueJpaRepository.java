package com.sczlin.cycleball.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.LeagueEntity;
import com.sczlin.cycleball.entity.LicenceEntity;

@Repository
public interface LeagueJpaRepository extends JpaRepository<LeagueEntity, Long> {

    LeagueEntity findOneByName(String name);

}
