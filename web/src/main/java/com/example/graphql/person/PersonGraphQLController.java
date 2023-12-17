package com.example.graphql.person;

import com.example.model.Person;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/api/graphql/persons")
public class PersonGraphQLController {
    @QueryMapping
    public Person getById(@Argument String id) {
        return Person.builder()
                .id("1")
                .firstName("James")
                .lastName("Jon")
                .dateOfBirth(LocalDate.of(1000, 1, 1))
                .build();
    }

    @QueryMapping
    public List<Person> listPersons() {
        return List.of(Person.builder()
                .id("1")
                .firstName("James")
                .lastName("Jon")
                .dateOfBirth(LocalDate.of(1000, 1, 1))
                .build());
    }

}
