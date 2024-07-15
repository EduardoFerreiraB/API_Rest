package com.challengeAPI.topics_api.repository;

import com.challengeAPI.topics_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface iUserRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String username);
}
