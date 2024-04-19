package com.testProjects.JWTauth.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
public class MessageResponse {
    private String message;
}
