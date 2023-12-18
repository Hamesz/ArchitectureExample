package com.example.person.createperson;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.createperson.model.ExistingPersonsModel;
import com.example.person.createperson.model.NewPersonModel;
import com.example.person.createperson.model.request.CreateUseCaseRequest;
import com.example.person.repository.PersonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

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
        repository.getByFullNameAndDateOfBirth(fullName, dateOfBirth);
        List<String> persons = List.of("");
        return persons.stream().map(ExistingPersonsModel::new).toList();
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
