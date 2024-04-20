package com.testProjects.JWTauth.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class LoginRequest {
    @NonNull
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
