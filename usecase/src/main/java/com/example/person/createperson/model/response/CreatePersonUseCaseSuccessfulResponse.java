package com.example.person.createperson.model.response;

import com.example.person.createperson.model.NewPersonModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class CreatePersonUseCaseSuccessfulResponse extends CreatePersonUseCaseResponse {

    private NewPersonModel newPersonModel;

    @Builder(builderMethodName = "CreatePersonUseCaseSuccessfulResponse")
    public CreatePersonUseCaseSuccessfulResponse(boolean success, NewPersonModel newPersonModel) {
        super(success);
        this.newPersonModel = newPersonModel;
    }
}
