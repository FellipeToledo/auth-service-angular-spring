package com.jfatech.authservice.repository;

import com.jfatech.authservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Fellipe Toledo
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
