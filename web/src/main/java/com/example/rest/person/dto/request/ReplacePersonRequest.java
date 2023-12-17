package com.example.rest.person.dto.request;

import lombok.Builder;
import lombok.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@Builder
public record ReplacePersonRequest(
        @NonNull String firstName,
        @NonNull String lastName,
        @Nullable String middleName,
        @NonNull LocalDate dateOfBirth
) {
}
