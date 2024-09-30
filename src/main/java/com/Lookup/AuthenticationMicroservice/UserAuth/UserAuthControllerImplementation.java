package com.Lookup.AuthenticationMicroservice.UserAuth;

import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginRequest;
import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginResponse;
import com.Lookup.AuthenticationMicroservice.UserAuth.Exceptions.UnvalidLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserAuthControllerImplementation implements UserAuthController {
    private final UserAuthService userAuthService;

    @Autowired
    public UserAuthControllerImplementation(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    @PutMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest login) throws UnvalidLogin {
        LoginResponse body = userAuthService.login(login);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(body);
    }
}
