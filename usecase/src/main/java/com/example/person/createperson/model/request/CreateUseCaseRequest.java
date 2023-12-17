package com.example.person.createperson.model.request;

import lombok.NonNull;

import java.time.LocalDate;

public record CreateUseCaseRequest(
        @NonNull String id,
        @NonNull String fullName,
        @NonNull LocalDate dateOfBirth
) {

}
