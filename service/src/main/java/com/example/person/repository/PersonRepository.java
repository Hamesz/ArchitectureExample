package com.example.person.repository;


import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Person;
import com.example.person.model.request.CreateRequest;
import com.example.person.model.response.CreateResponse;

import java.nio.DoubleBuffer;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Shared business data logic
 */
public interface PersonRepository {
    Person create(CreateRequest request);

    boolean deleteById(String id);

    Optional<Person> getById(String id);

    List<Person> getByFullNameAndDateOfBirth(FullName fullName, DateOfBirth dateOfBirth);
}
