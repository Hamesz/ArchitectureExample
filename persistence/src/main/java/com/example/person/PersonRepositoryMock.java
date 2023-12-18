package com.example.person;

import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Person;
import com.example.person.model.request.CreateRequest;
import com.example.person.repository.PersonRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
class PersonRepositoryMock implements PersonRepository {
    @Override
    public Person create(CreateRequest request) {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return true;
    }

    @Override
    public Person getById(String id) {
        return null;
    }

    @Override
    public Person getByFullNameAndDateOfBirth(FullName fullName, DateOfBirth dateOfBirth) {
        return null;
    }
}
