package com.maxi.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxi.login.dtos.VeiculeDTO;
import com.maxi.login.services.impl.VeiculeServiceImmplementation;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private VeiculeServiceImmplementation veiculeService;

    @PostMapping()
    public ResponseEntity<?> saveVeicule(@RequestBody VeiculeDTO obj) {
        return ResponseEntity.ok().body(veiculeService.saveVeicule(obj));
    }

    @GetMapping()
    public ResponseEntity<?> getAllUsuarios() {
        return ResponseEntity.ok().body(veiculeService.findAllVeicules());
    }
}
