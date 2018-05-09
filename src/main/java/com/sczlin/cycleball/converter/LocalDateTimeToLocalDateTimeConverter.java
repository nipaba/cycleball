package com.sczlin.cycleball.converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

@Component
public class LocalDateTimeToLocalDateTimeConverter extends BidirectionalConverter<LocalDateTime, LocalDateTime> {

    @Override
    public LocalDateTime convertTo(LocalDateTime source, Type<LocalDateTime> destinationType) {
        return source;
    }

    @Override
    public LocalDateTime convertFrom(LocalDateTime source, Type<LocalDateTime> destinationType) {
        return source;
    }

}