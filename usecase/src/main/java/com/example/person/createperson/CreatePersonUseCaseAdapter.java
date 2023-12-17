package com.example.person.createperson;

import com.example.person.createperson.model.ExistingPersonsModel;
import com.example.person.createperson.model.NewPersonModel;
import com.example.person.createperson.model.request.CreateUseCaseRequest;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

/**
 * This class has the role of responding to the requests of the use case. We have specified that the use case imp class
 * need only know about it own models so it can focus on truly executing the use case. But the data needs to be
 * retrieved from somwhere and mapped, Those operations occur within this class. It knows about the domain objects and
 * is exposed to the implementation details.
 */
@Component
public class CreatePersonUseCaseAdapter {

    public List<ExistingPersonsModel> getExistingPersons(final String fullName, final LocalDate dateOfBirth) {
        ExistingPersonsModel existingPerson1 = ExistingPersonsModel.builder().id("1").build();
        ExistingPersonsModel existingPerson2 = ExistingPersonsModel.builder().id("2").build();
        return List.of(existingPerson1, existingPerson2);
    }

    public NewPersonModel createNewPerson(CreateUseCaseRequest request) {
        return NewPersonModel.builder()
                .id(request.id())
                .fullName(request.fullName())
                .dateOfBirth(request.dateOfBirth())
                .createdAt(Instant.now())
                .build();
    }

}
