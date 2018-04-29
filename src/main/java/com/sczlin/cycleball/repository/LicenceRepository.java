package com.sczlin.cycleball.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.LicenceEntity;
import com.sczlin.cycleball.entity.PlayerEntity;

@Repository
public interface LicenceRepository extends JpaRepository<LicenceEntity, Long> {

}