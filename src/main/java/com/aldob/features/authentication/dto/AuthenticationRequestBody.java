package com.aldob.features.authentication.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequestBody {

    @NotNull
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotNull
    @NotBlank(message = "Password is mandatory")
    private String password;

}
