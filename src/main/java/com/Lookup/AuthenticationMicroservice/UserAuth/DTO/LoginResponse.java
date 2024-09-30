package com.Lookup.AuthenticationMicroservice.UserAuth.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class LoginResponse {
    @JsonProperty("token")
    private String token;
    @JsonProperty("username")
    private String username;
}
