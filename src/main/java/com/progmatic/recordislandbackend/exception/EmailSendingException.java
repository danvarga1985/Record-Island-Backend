package com.progmatic.recordislandbackend.exception;

public class EmailSendingException extends RuntimeException{

    public EmailSendingException(String message) {
        super(message);
    }
}
