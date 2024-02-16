package com.maxi.login.dtos;

import java.time.LocalDate;

import com.maxi.login.domains.Veicule;
import com.maxi.login.enums.VeiculeType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VeiculeDTO {

    private String marck;
    private String model;
    private Double price;
    private LocalDate fabricationDate;
    private VeiculeType type;

    public VeiculeDTO(String marck, String model, Double price, LocalDate fabricationDate, VeiculeType type) {
        this.marck = marck;
        this.model = model;
        this.price = price;
        this.fabricationDate = fabricationDate;
        this.type = type;
    }

    public VeiculeDTO(Veicule obj) {
        this.marck = obj.getMarck();
        this.model = obj.getModel();
        this.price = obj.getPrice();
        this.fabricationDate = obj.getFabricationDate();
        this.type = obj.getType();
    }

}
