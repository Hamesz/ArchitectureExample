package com.example.person.createperson.model.response.factory;

import com.example.person.createperson.model.NewPersonModel;
import com.example.person.createperson.model.response.CreateUseCaseFailureResponse;
import com.example.person.createperson.model.response.CreateUseCaseSuccessfulResponse;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class CreatePersonUseCaseResponseFactory {

    public static CreateUseCaseFailureResponse createForExistingPerson(final List<String> existingUsersIds) {
        return CreateUseCaseFailureResponse.builder()
                .existingUserIds(existingUsersIds)
                .build();
    }

    public static CreateUseCaseSuccessfulResponse createForNewPerson(final NewPersonModel newPersonModel) {
        return CreateUseCaseSuccessfulResponse.builder()
                .newPersonModel(newPersonModel)
                .build();
    }
}
