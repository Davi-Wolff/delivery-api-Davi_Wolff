package com.delivery_api.exception;

public class ValidationErrorResponse extends RuntimeException {
    public ValidationErrorResponse(String message) {
        super(message);
    }
}