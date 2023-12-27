package com.example.person.createperson.model;

import com.example.person.model.Id;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record ExistingPersonsModel(
        @NonNull Id id
) {}
