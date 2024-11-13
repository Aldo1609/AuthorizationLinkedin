package com.aldob.features.authentication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponseBody {

    private final String token;
    private final String message;

}
