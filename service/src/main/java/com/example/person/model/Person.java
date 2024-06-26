package com.example.person.model;

import lombok.Builder;
import lombok.NonNull;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

@Builder
public record Person(
        @NonNull Id id,
        @NonNull FullName fullName,
        @NonNull DateOfBirth dateOfBirth
) {

    public int age() {
        return (int) YEARS.between(dateOfBirth.value(), LocalDate.now());
    }

}
