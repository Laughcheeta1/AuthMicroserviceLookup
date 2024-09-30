package com.Lookup.AuthenticationMicroservice.UserAuth.DTO;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String username;

    private String password;
}
