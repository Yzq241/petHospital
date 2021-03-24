package com.ecnu.petHospital.user.exception;

public class UsernameAlreadyExistException extends RuntimeException {
    public UsernameAlreadyExistException() {
        super(null, null, true, false);
    }
}
