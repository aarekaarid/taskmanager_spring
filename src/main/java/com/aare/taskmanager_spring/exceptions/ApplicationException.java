package com.aare.taskmanager_spring.exceptions;

public class ApplicationException extends RuntimeException {
    public ApplicationException(String message){
        super(message);
    }
}

