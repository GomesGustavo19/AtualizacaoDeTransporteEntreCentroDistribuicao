package com.atualizacaotransporte.status.dto.request;

public class VeiculoRequest {

    private String placa;

    public VeiculoRequest(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
