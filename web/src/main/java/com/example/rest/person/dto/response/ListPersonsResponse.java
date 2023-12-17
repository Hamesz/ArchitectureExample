package com.example.rest.person.dto.response;

import com.example.model.Person;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ListPersonsResponse {
    List<Person> persons;
}
