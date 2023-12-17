package com.example.person.deleteperson;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DeletePersonUseCaseAdapter {

    public boolean deleteById(String id) {
        return id.equals("1");
    }

    public boolean deleteByFullNameAndDateOfBirth(String fullName, LocalDate dateOfBirth) {
        return true;
    }

}
