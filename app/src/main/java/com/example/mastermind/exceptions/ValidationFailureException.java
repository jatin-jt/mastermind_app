package com.example.mastermind.exceptions;

public class ValidationFailureException extends RuntimeException {

    public ValidationFailureException(String message) {
        super(message);
    }

    public ValidationFailureException(String message, Throwable cause) {
        super(message, cause);
    }
}
