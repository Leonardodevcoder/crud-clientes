package com.devleonardo.crudclientes.services.exceptions;

public class DataBaseNotFoundException extends RuntimeException {
    public DataBaseNotFoundException(String message) {
        super(message);
    }
}