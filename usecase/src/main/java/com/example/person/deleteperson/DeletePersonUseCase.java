package com.example.person.deleteperson;

import java.time.LocalDate;

public interface DeletePersonUseCase {

    boolean deleteById(String id);
    boolean deleteByFullNameAndDateOfBirth(String fullName, LocalDate dateOfBirth);

}
