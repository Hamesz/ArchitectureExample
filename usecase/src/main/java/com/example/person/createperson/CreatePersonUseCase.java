package com.example.person.createperson;

import com.example.person.createperson.model.request.CreateUseCaseRequest;
import com.example.person.createperson.model.response.CreatePersonUseCaseResponse;

/**
 * This public interface is the API of our use case. Each method can be thought of as sub use cases.
 *
 */
public interface CreatePersonUseCase {

    CreatePersonUseCaseResponse create(CreateUseCaseRequest request);
}
