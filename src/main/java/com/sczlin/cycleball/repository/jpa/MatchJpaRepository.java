package com.sczlin.cycleball.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.LicenceEntity;
import com.sczlin.cycleball.entity.MatchEntity;

@Repository
public interface MatchJpaRepository extends JpaRepository<MatchEntity, Long> {

}
