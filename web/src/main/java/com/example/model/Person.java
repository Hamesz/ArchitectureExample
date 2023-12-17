package com.example.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@SuperBuilder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NonNull String id;
    @NonNull String firstName;
    @NonNull String lastName;
    @Nullable
    String middleName;
    @NonNull LocalDate dateOfBirth;
}
