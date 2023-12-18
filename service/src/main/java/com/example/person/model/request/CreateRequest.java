package com.example.person.model.request;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Id;
import lombok.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

public record CreateRequest(
        @NonNull Id id,
        @NonNull FullName fullName,
        @Nullable DateOfBirth dateOfBirth,
        @Nullable int height
) {

}
