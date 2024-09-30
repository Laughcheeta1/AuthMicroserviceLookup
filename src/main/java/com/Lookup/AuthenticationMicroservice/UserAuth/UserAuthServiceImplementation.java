package com.Lookup.AuthenticationMicroservice.UserAuth;

import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginRequest;
import com.Lookup.AuthenticationMicroservice.UserAuth.DTO.LoginResponse;
import com.Lookup.AuthenticationMicroservice.UserAuth.Entity.UserAuth;
import com.Lookup.AuthenticationMicroservice.UserAuth.Exceptions.UnvalidLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImplementation implements UserAuthService {
    private final UserAuthDAO userAuthDAO;

    @Autowired
    public UserAuthServiceImplementation(UserAuthDAO userAuthDAO) {
        this.userAuthDAO = userAuthDAO;
    }

    @Override
    public LoginResponse login(LoginRequest login) throws UnvalidLogin {
        UserAuth response = userAuthDAO.findByNameAndPassword(login.getUsername(), login.getPassword())
                .orElseThrow(UnvalidLogin::new);

        return LoginResponse.builder()
                .username(response.getName())
                .token(null)  // TODO Implement the token generation
                .build();
    }
}
