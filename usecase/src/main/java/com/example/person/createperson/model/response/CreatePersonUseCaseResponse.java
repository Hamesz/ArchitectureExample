package com.example.person.createperson.model.response;

import com.example.person.createperson.model.NewPersonModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.Nullable;

import java.util.List;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePersonUseCaseResponse {

    protected boolean success;

    public boolean wasPersonCreated() {
        return this.success;
    }

}
