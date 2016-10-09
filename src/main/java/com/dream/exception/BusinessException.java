package com.dream.exception;

public class BusinessException extends RuntimeException {
    private String message;
    private String url;


    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, String url) {
        this.message = message;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}