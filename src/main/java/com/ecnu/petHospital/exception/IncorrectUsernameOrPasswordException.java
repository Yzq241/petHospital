package com.ecnu.petHospital.exception;

public class IncorrectUsernameOrPasswordException extends RuntimeException {
    public IncorrectUsernameOrPasswordException() {
        super(null, null, true, false);
    }
}
