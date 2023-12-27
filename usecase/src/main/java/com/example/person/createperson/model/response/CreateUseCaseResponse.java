package com.example.person.createperson.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
public abstract class CreateUseCaseResponse {

    public abstract boolean isSuccess();

}
