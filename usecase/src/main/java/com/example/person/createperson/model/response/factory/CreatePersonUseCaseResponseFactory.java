package com.example.person.createperson.model.response.factory;

import com.example.person.createperson.model.NewPersonModel;
import com.example.person.createperson.model.response.CreatePersonUseCaseFailureResponse;
import com.example.person.createperson.model.response.CreatePersonUseCaseSuccessfulResponse;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class CreatePersonUseCaseResponseFactory {

    public static CreatePersonUseCaseFailureResponse createForExistingPerson(final List<String> existingUsersIds) {
        return CreatePersonUseCaseFailureResponse.builder()
                .success(false)
                .existingUserIds(existingUsersIds)
                .build();
    }

    public static CreatePersonUseCaseSuccessfulResponse createForNewPerson(final NewPersonModel newPersonModel) {
        return CreatePersonUseCaseSuccessfulResponse.builder()
                .success(true)
                .newPersonModel(newPersonModel)
                .build();
    }
}
