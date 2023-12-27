package com.example.person.createperson.model;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Id;
import lombok.Builder;
import lombok.NonNull;

import java.time.Instant;

@Builder
public record NewPersonModel(
        @NonNull Id id,
        @NonNull FullName fullName,
        @NonNull DateOfBirth dateOfBirth,
        @NonNull Instant createdAt
) {
}
