package com.aldob.features.authentication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "users")
public class AuthenticationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Email
    @Column(unique = true)
    private String email;
    private Boolean emailVerified = false;
    private String emailVerificationToken = null;
    private LocalDateTime emailVerificationTokenExpiryDate = null;
    @JsonIgnore
    private String password;
    private String passwordResetToken = null;
    private LocalDateTime passwordResetTokenExpiryDate = null;

    public AuthenticationUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthenticationUser() {
    }


}
