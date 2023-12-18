package com.example.person.repository;


import com.example.person.model.DateOfBirth;
import com.example.person.model.FullName;
import com.example.person.model.Person;
import com.example.person.model.request.CreateRequest;
import com.example.person.model.response.CreateResponse;

import java.nio.DoubleBuffer;
import java.time.LocalDate;

/**
 * Shared business data logic
 */
public interface PersonRepository {
    Person create(CreateRequest request);

    boolean deleteById(String id);

    Person getById(String id);

    Person getByFullNameAndDateOfBirth(FullName fullName, DateOfBirth dateOfBirth);
}
