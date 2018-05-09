package com.sczlin.cycleball.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.ClubEntity;

@Repository
public interface ClubJpaRepository extends JpaRepository<ClubEntity, Long> {

    ClubEntity findOneByName(String name);

}
