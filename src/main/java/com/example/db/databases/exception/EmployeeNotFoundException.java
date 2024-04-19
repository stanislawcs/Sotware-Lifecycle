package com.example.db.databases.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    private static final String MESSAGE = "Employee with this passport number: %s not found!";

    public EmployeeNotFoundException(String passportNumber) {
        super(String.format(MESSAGE, passportNumber));
    }
}
