package com.hunterdowney.ridesharehd.repository;

import com.hunterdowney.ridesharehd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}