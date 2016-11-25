package com.dream.config.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LocalDatePersistenceConverter implements AttributeConverter<LocalDate, Date> {
    @Override
    public Date convertToDatabaseColumn(LocalDate date) {
        return Date.valueOf(date);
    }

    @Override
    public LocalDate convertToEntityAttribute(java.sql.Date date) {
        return date.toLocalDate();
    }

}
