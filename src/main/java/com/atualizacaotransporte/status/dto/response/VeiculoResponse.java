package com.atualizacaotransporte.status.dto.response;

import java.util.Date;

public class VeiculoResponse {

    private Integer id;
    private Date anoVeiculo;
    private String placa;
    private String chassis;

    public VeiculoResponse(Integer id, Date anoVeiculo, String placa, String chassis) {
        this.id = id;
        this.anoVeiculo = anoVeiculo;
        this.placa = placa;
        this.chassis = chassis;
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

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
}
