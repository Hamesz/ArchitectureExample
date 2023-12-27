package com.example.rest.person.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Builder;
import lombok.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@Builder
public record CreatePersonRequest(
        @NonNull String firstName,
        @NonNull String lastName,
        @Nullable String middleName,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        @NonNull LocalDate dateOfBirth
) {
}
