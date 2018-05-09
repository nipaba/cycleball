package com.sczlin.cycleball.repository;

import java.util.List;

import com.sczlin.cycleball.domain.Licence;

public interface LicenceRepository {

    void save(Licence licence);

    List<Licence> findAll();

}
