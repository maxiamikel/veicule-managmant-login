package com.maxi.login.domains;

import java.time.LocalDate;

import com.maxi.login.enums.VeiculeType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "veicules")
@Getter
@Setter
@NoArgsConstructor
public class Veicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marck;
    private String model;
    private Double price;

    @Temporal(TemporalType.DATE)
    private LocalDate fabricationDate;

    @Enumerated(EnumType.STRING)
    private VeiculeType type;

}
