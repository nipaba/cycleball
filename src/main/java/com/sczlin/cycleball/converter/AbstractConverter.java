package com.sczlin.cycleball.converter;

import ma.glasnost.orika.MapperFactory;

public interface AbstractConverter {

    void addConversions(MapperFactory mapperFactory);

}