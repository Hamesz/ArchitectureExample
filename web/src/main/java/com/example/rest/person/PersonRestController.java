package com.example.rest.person;

import com.example.model.Person;
import com.example.rest.person.dto.request.ReplacePersonRequest;
import com.example.rest.person.dto.response.ReplacePersonResponse;
import com.example.rest.person.dto.request.CreatePersonRequest;
import com.example.rest.person.dto.response.ListPersonsResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/rest/v1/persons")
public class PersonRestController {

    @GetMapping
    public ResponseEntity<ListPersonsResponse> listPersons() {
        var response = ListPersonsResponse.builder()
                .persons(List.of(Person.builder()
                        .id("1")
                        .firstName("James")
                        .lastName("Hanratty")
                        .dateOfBirth(LocalDate.of(1998, 2, 18))
                        .build()))
                .build();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<?> createPerson(@RequestParam final CreatePersonRequest request) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePerson(@PathParam("id") final String id) {
        System.out.println("Deleting person with id: " + id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReplacePersonResponse> replacePerson(@PathParam("id") final String id,
                                                               @RequestParam final ReplacePersonRequest request) {
        System.out.println("Replacing person with id: " + id + " and request: " + request);
        return ResponseEntity.ok().build();
    }
}
