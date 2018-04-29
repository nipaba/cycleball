package com.sczlin.cycleball.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.PlayerEntity;


@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

}
