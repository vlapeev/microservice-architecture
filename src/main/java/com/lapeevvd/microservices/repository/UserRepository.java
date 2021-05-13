package com.lapeevvd.microservices.repository;

import com.lapeevvd.microservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findByEmail(String email);
}