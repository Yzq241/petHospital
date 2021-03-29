package com.ecnu.petHospital.exception;

public class UsernameAlreadyExistException extends RuntimeException {
    public UsernameAlreadyExistException() {
        super(null, null, true, false);
    }
}
