package com.testProjects.JWTauth.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginRequest {
    @NonNull
    @NotBlank
    private String Username;

    @NotBlank
    private String password;
}
