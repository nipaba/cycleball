package com.sczlin.cycleball.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.LicenceEntity;
import com.sczlin.cycleball.entity.PlayerEntity;

@Repository
public interface LicenceJpaRepository extends JpaRepository<LicenceEntity, Long> {

}