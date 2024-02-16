package com.maxi.login.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.maxi.login.domains.Veicule;
import com.maxi.login.dtos.VeiculeDTO;
import com.maxi.login.repositories.VeiculeRepository;
import com.maxi.login.services.VeiculeService;

public class VeiculeServiceImmplementation implements VeiculeService {

    private VeiculeRepository usuarioRepository;

    public VeiculeServiceImmplementation(VeiculeRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Veicule saveVeicule(VeiculeDTO obj) {
        // Veicule usuarioDB = this.findByVeicule(obj.getVeicule());

        Veicule newObj = new Veicule();
        newObj.setId(null);
        newObj.setFabricationDate(obj.getFabricationDate());
        newObj.setMarck(obj.getMarck());
        newObj.setModel(obj.getModel());
        newObj.setPrice(obj.getPrice());
        newObj.setType(obj.getType());
        return usuarioRepository.save(newObj);

    }

    @Override
    public List<VeiculeDTO> findAllVeicules() {
        List<Veicule> list = new ArrayList<Veicule>();
        List<VeiculeDTO> listDto = new ArrayList<VeiculeDTO>();
        list = usuarioRepository.findAll();
        listDto = list.stream().map(x -> new VeiculeDTO(x)).collect(Collectors.toList());
        return listDto;
    }

    @Override
    public Veicule findByVeicule(String veicule) {
        return null;
    }

    // @Override
    // public Veicule findByUsuario(String usuario) {
    // Veicule usuarioDB = usuarioRepository.findByUsuario(usuario);
    // if (usuarioDB == null) {
    // return null;
    // }
    // return usuarioDB;
    // }

}
