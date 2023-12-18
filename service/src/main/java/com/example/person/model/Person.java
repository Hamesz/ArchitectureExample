package com.example.person.model;

import lombok.NonNull;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public record Person(
        @NonNull Id id,
        @NonNull FullName fullName,
        @NonNull DateOfBirth dateOfBirth
) {

    public int age() {
        return (int) YEARS.between(dateOfBirth.value(), LocalDate.now());
    }

}
