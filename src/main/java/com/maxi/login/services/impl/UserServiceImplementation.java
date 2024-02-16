package com.maxi.login.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.maxi.login.domains.User;
import com.maxi.login.dtos.UserRequestDTO;
import com.maxi.login.enums.UserRole;
import com.maxi.login.repositories.UserRepository;
import com.maxi.login.services.UserService;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User register(UserRequestDTO data) {
        User userDB = userRepository.findLogin(data.getLogin());
        if (userDB == null) {
            String hashPwd = passwordEncoder.encode(data.getPassword());
            User newUser = new User();
            newUser.setId(null);
            newUser.setLogin(data.getLogin());
            newUser.setPassword(hashPwd);
            newUser.setRole(UserRole.USER);
            return userRepository.save(newUser);

        } else {
            throw new RuntimeException("Username is taken");
        }
    }

}
