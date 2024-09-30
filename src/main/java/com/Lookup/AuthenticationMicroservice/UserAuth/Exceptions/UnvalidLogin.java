package com.Lookup.AuthenticationMicroservice.UserAuth.Exceptions;

public class UnvalidLogin extends Exception{
    public UnvalidLogin() {
        super("Username or password is incorrect");
    }
}
