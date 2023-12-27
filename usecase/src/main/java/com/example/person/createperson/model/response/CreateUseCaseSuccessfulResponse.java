package com.example.person.createperson.model.response;

import com.example.person.createperson.model.NewPersonModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Value
@Builder
public class CreateUseCaseSuccessfulResponse extends CreateUseCaseResponse {
    NewPersonModel newPersonModel;

    @Builder(builderClassName = "CreateUseCaseSuccessfulResponseBuilder")
    public CreateUseCaseSuccessfulResponse(NewPersonModel newPersonModel) {
        this.newPersonModel = newPersonModel;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }
}
