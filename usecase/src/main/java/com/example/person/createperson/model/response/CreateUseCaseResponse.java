package com.example.person.createperson.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class CreateUseCaseResponse {

    protected boolean success;

    public boolean wasPersonCreated() {
        return this.success;
    }

}
