package com.example.person.createperson;

import com.example.person.createperson.adapter.CreatePersonUseCaseAdapter;
import com.example.person.createperson.model.ExistingPersonsModel;
import com.example.person.createperson.model.request.CreateUseCaseRequest;
import com.example.person.createperson.model.response.CreateUseCaseResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.person.createperson.model.response.factory.CreatePersonUseCaseResponseFactory.createForExistingPerson;
import static com.example.person.createperson.model.response.factory.CreatePersonUseCaseResponseFactory.createForNewPerson;

/**
 * This is where we implement our use cases.
 * In this class we avoid using global domain objects and instead have our own specific model objects, this provides
 * the benefit that it will not contain data irrelavent to this use case and also if the domain model changes then this use case
 * is not affected.
 * The sole purpose of these use case imp classes is to just focus on executing the use cases with all required data.
 */
@Service
@RequiredArgsConstructor
class CreatePersonUseCaseImp implements CreatePersonUseCase {

    @NonNull
    private final CreatePersonUseCaseAdapter adapter;

    @Override
    public CreateUseCaseResponse create(CreateUseCaseRequest request) {
        List<ExistingPersonsModel> personsWithSameFullNameAndDateOfBirth = adapter
                .getExistingPersons(request.fullName(), request.dateOfBirth());

        if (!personsWithSameFullNameAndDateOfBirth.isEmpty()) {
            return createForExistingPerson(personsWithSameFullNameAndDateOfBirth.stream()
                    .map(ExistingPersonsModel::id)
                    .toList());
        } else {
            var newPerson = adapter.createNewPerson(request);
            return createForNewPerson(newPerson);
        }
    }
}
