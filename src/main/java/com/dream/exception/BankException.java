package com.dream.exception;

public class BankException extends RuntimeException {


    public BankException(String message) {
        super(message);
    }

    public BankException(String message, Throwable cause) {
        super(message, cause);
    }
}