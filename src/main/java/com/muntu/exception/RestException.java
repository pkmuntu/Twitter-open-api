package com.muntu.exception;

public class RestException extends RuntimeException {

    public RestException() {
        super();
    }

    public RestException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public RestException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public RestException(String arg0) {
        super(arg0);
    }

    public RestException(Throwable arg0) {
        super(arg0);
    }

}
