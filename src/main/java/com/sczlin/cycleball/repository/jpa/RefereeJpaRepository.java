package com.sczlin.cycleball.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sczlin.cycleball.entity.RefereeEntity;

@Repository
public interface RefereeJpaRepository extends JpaRepository<RefereeEntity, Long> {

}
