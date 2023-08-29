package com.atualizacaotransporte.status.dto.response;

import java.util.Date;

public class VeiculoResponse {

    private Integer id;
    private String anoVeiculo;
    private String placa;
    private String licenciamento;

    public VeiculoResponse() {
    }

    public VeiculoResponse(Integer id, String anoVeiculo, String placa, String licenciamento) {
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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getlicenciamento() {
        return licenciamento;
    }

    public void setLicenciamento(String licenciamento) {
        this.licenciamento = licenciamento;
    }
}
