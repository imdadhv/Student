package com.example.demo.exception;

public class StudentNotFoundException extends NotFoundException {
    public static final String MESSAGE = "Student %s does not exist";
    private static final long serialVersionUID = 5843213248811L;

    public StudentNotFoundException(Long studentID) {
        super(String.format(MESSAGE,studentID));
    }

}
