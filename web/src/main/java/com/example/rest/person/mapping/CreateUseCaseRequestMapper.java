package com.example.rest.person.mapping;

import com.example.person.createperson.model.request.CreateUseCaseRequest;
import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.rest.person.dto.request.CreatePersonRequest;
import graphql.VisibleForTesting;
import graphql.com.google.common.base.Strings;
import lombok.experimental.UtilityClass;
import org.springframework.lang.Nullable;

@UtilityClass
public class CreateUseCaseRequestMapper {

    public static CreateUseCaseRequest toCreateUseCaseRequest(final CreatePersonRequest request) {
        return CreateUseCaseRequest.builder()
                .fullName(toFullName(request.firstName(), request.middleName(), request.lastName()))
                .dateOfBirth(new DateOfBirth(request.dateOfBirth()))
                .build();
    }

    @VisibleForTesting
    static FullName toFullName(final String firstName, @Nullable final String middleName, final String lastName) {
        String fullName = String.format("%s %s", firstName, lastName);
        if (!Strings.isNullOrEmpty(middleName)) {
            fullName = String.format("%s %s %s", firstName, middleName, lastName);
        }
        return new FullName(fullName);
    }

}
