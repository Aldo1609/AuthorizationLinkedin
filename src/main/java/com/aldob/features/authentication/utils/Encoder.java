package com.aldob.features.authentication.utils;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Component
public class Encoder {


    // Esta funcion toma un string y lo devuelve como un encoded String.
    public String encode(String rawString) throws NoSuchAlgorithmException {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(rawString.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("Error encoding string: ", e);
        }
    }

    public boolean matches(String rawString, String encodedString) throws NoSuchAlgorithmException {
        return encode(rawString).equals(encodedString);
    }

}
