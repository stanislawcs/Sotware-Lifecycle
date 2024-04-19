package com.example.db.databases.domain;

public record ClientRequest(String passportNumber,
                            String name,
                            int age,
                            String phoneNumber) {
}
