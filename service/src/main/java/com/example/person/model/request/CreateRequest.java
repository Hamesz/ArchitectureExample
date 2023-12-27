package com.example.person.model.request;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Id;
import lombok.Builder;
import lombok.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@Builder
public record CreateRequest(
        @NonNull FullName fullName,
        @NonNull DateOfBirth dateOfBirth,
        @Nullable Integer height
) {

}
