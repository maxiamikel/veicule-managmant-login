package com.maxi.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.maxi.login.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public UserDetails findByLogin(String login);
}
