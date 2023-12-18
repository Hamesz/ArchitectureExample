package com.example.person.operations;

import com.example.person.model.request.CreateRequest;
import com.example.person.model.response.CreateResponse;

import java.time.LocalDate;

/**
 * Shared business operations
 */
public interface PersonOperations {
    void getOrCreate(CreateRequest request);
}
