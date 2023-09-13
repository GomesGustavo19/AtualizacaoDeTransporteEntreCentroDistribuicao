package com.atualizacaotransporte.status.dto.request;

import com.atualizacaotransporte.status.validation.constrains.PlacaCarro;
import jakarta.validation.constraints.NotBlank;

public class VeiculoRequest {

    private String placa;

    public VeiculoRequest() {
    }

    public String getPlaca() {
        return placa;
    }

}
