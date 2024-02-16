package com.maxi.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxi.login.domains.Veicule;

public interface VeiculeRepository extends JpaRepository<Veicule, Long> {

    // public Veicule findByUsuario(String usuario);
}
