package com.example.person.deleteperson;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * This example shows a very simple use case where we end up just calling the adapter since most of this logic
 * lies in the implementation details and very little in the business logic.
 */
@Service
@RequiredArgsConstructor
public class DeletePersonUseCaseImp implements DeletePersonUseCase {

    @NonNull
    private final DeletePersonUseCaseAdapter adapter;

    @Override
    public boolean deleteById(String id) {
        return adapter.deleteById(id);
    }

    @Override
    public boolean deleteByFullNameAndDateOfBirth(String fullName, LocalDate dateOfBirth) {
        return adapter.deleteByFullNameAndDateOfBirth(fullName, dateOfBirth);
    }
}
