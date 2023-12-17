package com.example.rest.person.dto.response;

import com.example.model.Person;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ReplacePersonResponse extends Person {

}
