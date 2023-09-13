package com.atualizacaotransporte.status.model;

import com.atualizacaotransporte.status.exception.VeiculoException;
import com.atualizacaotransporte.status.validation.constrains.PlacaCarro;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Min(2010)
    private String anoVeiculo;
    @NotBlank
    @PlacaCarro
    private String placa;
    private String licenciamento;

    @Deprecated
    public Veiculo() {
    }

    public Veiculo(Integer id, String anoVeiculo, String placa, String licenciamento) {
        this.id = id;
        this.anoVeiculo = anoVeiculo;
        this.placa = placa;
        this.licenciamento = licenciamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(String anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) { this.placa = placa;}

    public String getLicenciamento() {
        return licenciamento;
    }

    public void setLicenciamento(String licenciamento) {
        this.licenciamento = licenciamento;
    }
}
