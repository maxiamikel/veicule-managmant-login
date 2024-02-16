package com.maxi.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.login.dtos.RequestLoginDTO;
import com.maxi.login.dtos.UserRequestDTO;
import com.maxi.login.services.impl.UserServiceImplementation;

@RestController
@RequestMapping("/auth")
public class AuthorizationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserServiceImplementation userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody RequestLoginDTO loginDTO) {
        var userNamePassword = new UsernamePasswordAuthenticationToken(loginDTO.getLogin(), loginDTO.getPassword());
        var auth = authenticationManager.authenticate(userNamePassword);
        return ResponseEntity.ok().body(auth);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRequestDTO userRequest) {
        return ResponseEntity.ok().body(userService.register(userRequest));
    }

}
