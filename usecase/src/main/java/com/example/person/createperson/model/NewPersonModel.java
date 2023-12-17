package com.example.person.createperson.model;

import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;
import java.time.LocalDate;

@Builder
public record NewPersonModel(
        @NonNull String id,
        @NonNull String fullName,
        @NonNull LocalDate dateOfBirth,
        @NonNull Instant createdAt
) {
}
