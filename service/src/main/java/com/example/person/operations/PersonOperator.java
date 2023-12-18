package com.example.person.operations;

import com.example.person.model.request.CreateRequest;
import com.example.person.model.response.CreateResponse;
import com.example.person.repository.PersonRepository;
import jakarta.annotation.PostConstruct;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PersonOperator implements PersonOperations {

    @NonNull
    private final PersonRepository repository;

    @Override
    public void getOrCreate(CreateRequest request) {

    }
}
