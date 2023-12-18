package com.example.person.model;

import lombok.NonNull;

import java.time.LocalDate;

public record DateOfBirth(@NonNull LocalDate value) {
}
