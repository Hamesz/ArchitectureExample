package com.example.person.createperson.model.response;

import com.example.person.createperson.model.NewPersonModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class CreateUseCaseSuccessfulResponse extends CreateUseCaseResponse {
    private NewPersonModel newPersonModel;

    @Builder(builderClassName = "CreateUseCaseSuccessfulResponseBuilder")
    public CreateUseCaseSuccessfulResponse(NewPersonModel newPersonModel) {
        super(true);
        this.newPersonModel = newPersonModel;
    }
}
