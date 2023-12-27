package com.example.rest.person;

import com.example.model.Person;
import com.example.person.createperson.CreatePersonUseCase;
import com.example.person.createperson.model.response.CreateUseCaseFailureResponse;
import com.example.person.createperson.model.response.CreateUseCaseSuccessfulResponse;
import com.example.rest.person.dto.request.ReplacePersonRequest;
import com.example.rest.person.dto.response.ReplacePersonResponse;
import com.example.rest.person.dto.request.CreatePersonRequest;
import com.example.rest.person.dto.response.ListPersonsResponse;
import jakarta.websocket.server.PathParam;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

import static com.example.rest.person.mapping.CreateUseCaseRequestMapper.toCreateUseCaseRequest;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/rest/v1/persons")
@RequiredArgsConstructor
public class PersonRestController {

    @NonNull
    private final CreatePersonUseCase createPersonUseCase;

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
    public ResponseEntity<?> createPerson(@RequestBody final CreatePersonRequest request) {
        var response = createPersonUseCase.create(toCreateUseCaseRequest(request));
        var httpStatus = response.isSuccess() ? CREATED : INTERNAL_SERVER_ERROR;
        var body = response.isSuccess() ? null : ((CreateUseCaseFailureResponse) response).getExistingUserIds();

        return ResponseEntity
                .status(httpStatus)
                .body(body);
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
