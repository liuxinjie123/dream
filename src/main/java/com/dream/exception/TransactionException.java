package com.dream.exception;

public class TransactionException extends RuntimeException {
    private String message;

    public TransactionException(String message) {
        super(message);
        this.message = message;
    }
}
