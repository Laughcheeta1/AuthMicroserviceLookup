package com.Lookup.AuthenticationMicroservice.UserAuth;

import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginRequest;
import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginResponse;
import com.Lookup.AuthenticationMicroservice.UserAuth.Exceptions.UnvalidLogin;

public interface UserAuthService {
    LoginResponse login(LoginRequest login) throws UnvalidLogin;
}
