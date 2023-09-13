package com.atualizacaotransporte.status.dto.request;

public class VeiculoAtualizacaoRequest {

    private Integer id;
    private String placa;
    private String licenciamento;

    public VeiculoAtualizacaoRequest() {
    }

    public String getPlaca() {
        return placa;
    }

    public String getLicenciamento() {
        return licenciamento;
    }

    public Integer getId() {
        return id;
    }
}
