package com.sczlin.cycleball.converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

@Component
public class DateToStringConverter extends BidirectionalConverter<LocalDateTime, String> {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public String convertTo(LocalDateTime source, Type<String> destinationType) {
        return source.format(formatter);
    }

    @Override
    public LocalDateTime convertFrom(String source, Type<LocalDateTime> destinationType) {
        return LocalDate.parse(source, formatter).atStartOfDay();
    }

}