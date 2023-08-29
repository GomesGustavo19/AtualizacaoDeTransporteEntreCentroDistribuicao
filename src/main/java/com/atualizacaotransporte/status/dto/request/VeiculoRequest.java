package com.atualizacaotransporte.status.dto.request;

import com.atualizacaotransporte.status.validation.constrains.PlacaCarro;
import jakarta.validation.constraints.NotBlank;

public class VeiculoRequest {

    private String placa;

    public VeiculoRequest(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
