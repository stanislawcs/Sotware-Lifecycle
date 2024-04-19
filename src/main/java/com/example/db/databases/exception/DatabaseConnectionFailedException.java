package com.example.db.databases.exceptions;

public class DatabaseConnectionFailedException extends RuntimeException {
    public DatabaseConnectionFailedException(String databaseName) {
        super("Cannot connect to database: %s".formatted(databaseName));
    }
}
