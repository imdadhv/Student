package com.example.demo.exception;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = 5843213248811L;

    public NotFoundException(String message) {
        super(message);
    }
    public NotFoundException(String message, Throwable ex) {
        super(message, ex);
    }
}
