package com.aldob.features.authentication.repository;

import com.aldob.features.authentication.model.AuthenticationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthenticationRepository extends JpaRepository<AuthenticationUser, Long> {


    Optional<AuthenticationUser> findByEmail(String email);
}
