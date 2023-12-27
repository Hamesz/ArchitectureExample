package com.example.person;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Id;
import com.example.person.model.Person;
import com.example.person.model.request.CreateRequest;
import com.example.person.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static java.util.Collections.emptyList;

@Repository
class PersonRepositoryMock implements PersonRepository {
    @Override
    public Person create(final CreateRequest request) {
        return Person.builder()
                .dateOfBirth(request.dateOfBirth())
                .fullName(request.fullName())
                .id(new Id(UUID.randomUUID().toString()))
                .build();
    }

    @Override
    public boolean deleteById(String id) {
        return true;
    }

    @Override
    public Optional<Person> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Person> getByFullNameAndDateOfBirth(FullName fullName, DateOfBirth dateOfBirth) {
        return emptyList();
    }
}
