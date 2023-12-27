package com.example.person.createperson.model.response;

import com.example.person.model.Id;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * This indicates the creation of a new person was unsuccessful due to the existence of persons with the same full name
 * and date of birth.
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Builder
public class CreateUseCaseFailureResponse extends CreateUseCaseResponse {
    List<Id> existingUserIds;

    @Builder(builderMethodName = "CreatePersonUseCaseFailureResponseBuilder")
    public CreateUseCaseFailureResponse(List<Id> existingUserIds) {
        this.existingUserIds = existingUserIds;
    }


    @Override
    public boolean isSuccess() {
        return false;
    }
}
