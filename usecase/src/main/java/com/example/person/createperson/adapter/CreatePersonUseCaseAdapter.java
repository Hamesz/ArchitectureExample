package com.example.person.createperson.adapter;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.createperson.model.ExistingPersonsModel;
import com.example.person.createperson.model.NewPersonModel;
import com.example.person.createperson.model.request.CreateUseCaseRequest;
import com.example.person.model.Id;
import com.example.person.repository.PersonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static com.example.person.createperson.adapter.mapping.CreateRequestMapper.toCreateRequest;

/**
 * This class has the role of responding to the requests of the use case. We have specified that the use case imp class
 * need only know about it own models so it can focus on truly executing the use case. But the data needs to be
 * retrieved from somwhere and mapped, Those operations occur within this class. It knows about the domain objects and
 * is exposed to the implementation details.
 */
@Component
@RequiredArgsConstructor
public class CreatePersonUseCaseAdapter {

    @NonNull
    private final PersonRepository repository;

    public List<ExistingPersonsModel> getExistingPersons(final FullName fullName, final DateOfBirth dateOfBirth) {
        var response = repository.getByFullNameAndDateOfBirth(fullName, dateOfBirth);
        return response.stream()
                .map(person -> ExistingPersonsModel.builder().id(person.id()).build())
                .toList();
    }

    public NewPersonModel createNewPerson(CreateUseCaseRequest request) {
        var response = repository.create(toCreateRequest(request));
        return NewPersonModel.builder()
                .id(response.id())
                .fullName(response.fullName())
                .dateOfBirth(response.dateOfBirth())
                .build();
    }

}
