package com.aldob.features.authentication.service;

import com.aldob.features.authentication.dto.AuthenticationRequestBody;
import com.aldob.features.authentication.dto.AuthenticationResponseBody;
import com.aldob.features.authentication.model.AuthenticationUser;

import java.security.NoSuchAlgorithmException;

public interface AuthenticationService {

    AuthenticationUser getUser(String email);

    void sendEmailVerificationToken(String email) throws NoSuchAlgorithmException;

    void validateEmailVerificationToken(String token, String email) throws NoSuchAlgorithmException;

    AuthenticationResponseBody login(AuthenticationRequestBody loginRequestBody) throws NoSuchAlgorithmException;

    AuthenticationResponseBody register(AuthenticationRequestBody registerRequestBody) throws NoSuchAlgorithmException;

    void sendPasswordResetToken(String email) throws NoSuchAlgorithmException;

    void resetPassword(String email, String newPassword, String token) throws NoSuchAlgorithmException;
}