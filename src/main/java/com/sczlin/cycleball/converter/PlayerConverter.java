package com.sczlin.cycleball.converter;

import org.springframework.stereotype.Component;

import com.sczlin.cycleball.controller.newplayer.NewPlayerModel;
import com.sczlin.cycleball.domain.Player;
import com.sczlin.cycleball.entity.PlayerEntity;

import ma.glasnost.orika.MapperFactory;

@Component
public class PlayerConverter implements AbstractConverter {

    @Override
    public void addConversions(MapperFactory mapperFactory) {
        mapperFactory.classMap(PlayerEntity.class, Player.class)
                .field("firstname", "firstname")
                .field("surname", "surname")
                .fieldMap("birthdate", "birthdate").converter("dateToDate").add()
                .field("licences", "licences")
                .register();

        mapperFactory.classMap(NewPlayerModel.class, Player.class)
                .field("firstname", "firstname")
                .field("surname", "surname")
                .fieldMap("birthdate", "birthdate").converter("stringToDate").add()
                .register();
    }
    
    

}
