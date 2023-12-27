package com.example.person.createperson.adapter.mapping;

import com.example.person.createperson.model.request.CreateUseCaseRequest;
import com.example.person.model.request.CreateRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CreateRequestMapper {

    public static CreateRequest toCreateRequest(final CreateUseCaseRequest request) {
        return CreateRequest.builder()
                .dateOfBirth(request.dateOfBirth())
                .fullName(request.fullName())
                .build();
    }

}
