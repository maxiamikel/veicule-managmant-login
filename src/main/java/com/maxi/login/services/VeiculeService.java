package com.maxi.login.services;

import java.util.List;

import com.maxi.login.domains.Veicule;
import com.maxi.login.dtos.VeiculeDTO;

public interface VeiculeService {
    public Veicule saveVeicule(VeiculeDTO obj);

    public List<VeiculeDTO> findAllVeicules();

    public Veicule findByVeicule(String veicule);
}
