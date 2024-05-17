package com.muntu.exception;

public class TwitterAPIServiceUnavailableException extends  RuntimeException{

    private static final long serialVersionUID = 1L;

    private String field;

    public TwitterAPIServiceUnavailableException(String message) {
        super(message);
    }

    public TwitterAPIServiceUnavailableException(String field, String message) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}

