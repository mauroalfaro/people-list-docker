package com.alfarosoft.peoplelist.exception;

public class AddressValidationException extends RuntimeException{

    private String message;

    public AddressValidationException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
