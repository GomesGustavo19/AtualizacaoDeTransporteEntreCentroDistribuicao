package com.atualizacaotransporte.status.model;

import jakarta.persistence.*;
import validation.constrains.PlacaDeCaminhao;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date anoVeiculo;
    @PlacaDeCaminhao
    private String placa;
    private String licenciamento;

    @Deprecated
    public Veiculo() {
    }

    public Veiculo(Integer id, Date anoVeiculo, String placa, String licenciamento) {
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

    public Date getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Date anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getLicenciamento() {
        return licenciamento;
    }

    public void setLicenciamento(String licenciamento) {
        this.licenciamento = licenciamento;
    }
}
