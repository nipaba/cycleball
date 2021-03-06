package com.sczlin.cycleball.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.PlayerEntity;

@Repository
public interface PlayerJpaRepository extends JpaRepository<PlayerEntity, Long> {

    PlayerEntity findOneByFirstnameAndSurname(String firstName, String surname);

}
