package com.dream.exception;

public class IndexException extends IllegalAccessException {

    private int index;
    private String message;

    public IndexException(){

    }

    public IndexException(int index ) {
        this.index = index;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = index + "doesn't correspond to the object";
    }
}
