package com.example.person.createperson.model.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * This indicates the creation of a new person was unsuccessful due to the existence of persons with the same full name
 * and date of birth.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class CreateUseCaseFailureResponse extends CreateUseCaseResponse {
    private List<String> existingUserIds;

    @Builder(builderMethodName = "CreatePersonUseCaseFailureResponseBuilder")
    public CreateUseCaseFailureResponse(List<String> existingUserIds) {
        super(false);
        this.existingUserIds = existingUserIds;
    }
}
