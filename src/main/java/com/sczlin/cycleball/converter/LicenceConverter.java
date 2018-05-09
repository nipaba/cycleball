package com.sczlin.cycleball.converter;

import org.springframework.stereotype.Component;

import com.sczlin.cycleball.controller.newlicence.NewLicenceModel;
import com.sczlin.cycleball.domain.Licence;
import com.sczlin.cycleball.entity.LicenceEntity;

import ma.glasnost.orika.MapperFactory;

@Component
public class LicenceConverter implements AbstractConverter {

    @Override
    public void addConversions(MapperFactory mapperFactory) {

        mapperFactory.classMap(LicenceEntity.class, Licence.class)
                .field("year", "year")
                .field("number", "number")
                .register();

        mapperFactory.classMap(NewLicenceModel.class, Licence.class)
                .field("year", "year")
                .field("number", "number")
                .register();
    }

}
