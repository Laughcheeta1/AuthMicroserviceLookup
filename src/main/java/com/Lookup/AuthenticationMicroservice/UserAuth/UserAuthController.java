package com.Lookup.AuthenticationMicroservice.UserAuth;

import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginRequest;
import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginResponse;
import com.Lookup.AuthenticationMicroservice.UserAuth.Exceptions.UnvalidLogin;
import org.springframework.http.ResponseEntity;

public interface UserAuthController {
    ResponseEntity<LoginResponse> login(LoginRequest login) throws UnvalidLogin;
}
