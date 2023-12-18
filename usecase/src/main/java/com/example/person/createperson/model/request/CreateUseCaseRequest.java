package com.example.person.createperson.model.request;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Id;
import lombok.NonNull;

import java.time.LocalDate;

public record CreateUseCaseRequest(
        @NonNull Id id,
        @NonNull FullName fullName,
        @NonNull DateOfBirth dateOfBirth
) {

}
