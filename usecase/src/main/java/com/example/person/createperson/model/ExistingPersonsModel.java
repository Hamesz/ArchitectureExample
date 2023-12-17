package com.example.person.createperson.model;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record ExistingPersonsModel(
        @NonNull String id
) {}
