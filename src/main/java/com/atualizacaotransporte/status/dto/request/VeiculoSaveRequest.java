package com.atualizacaotransporte.status.dto.request;

import java.util.Date;

public class VeiculoSaveRequest {

    private Integer id;
    private String anoVeiculo;

    private String placa;
    private String licenciamento;

    public VeiculoSaveRequest() {
    }

    public VeiculoSaveRequest(Integer id, String anoVeiculo, String placa, String licenciamento) {
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


    public String getPlaca() {
        return placa;
    }


    public String getLicenciamento() {
        return licenciamento;
    }

    public void setAnoVeiculo(String anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setLicenciamento(String licenciamento) {
        this.licenciamento = licenciamento;
    }
}
