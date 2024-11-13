package com.aldob.configuration;

import com.aldob.features.authentication.model.AuthenticationUser;
import com.aldob.features.authentication.repository.AuthenticationRepository;
import com.aldob.features.authentication.utils.Encoder;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class LoadDataBaseConfiguration {

    private final Encoder encoder;

    @Bean
    public CommandLineRunner initDatabase(AuthenticationRepository authenticationUserRepository) {
        return args -> {
            AuthenticationUser user = new AuthenticationUser("user@example.com", encoder.encode("user"));
            authenticationUserRepository.save(user);
        };
    }


}
