package com.maxi.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestParam;

import com.maxi.login.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public UserDetails findByLogin(String login);

    @Query("SELECT u FROM User u WHERE u.login =:login")
    public User findLogin(@RequestParam("login") String login);
}
