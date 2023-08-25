package com.atualizacaotransporte.status.dto.mapper;

import com.atualizacaotransporte.status.dto.request.VeiculoRequest;
import com.atualizacaotransporte.status.dto.response.VeiculoResponse;
import com.atualizacaotransporte.status.model.Veiculo;

public class VeiculoMapper {

    public static Veiculo toVeiculo(VeiculoRequest request){
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(request.getPlaca());

        return veiculo;
    }

    public static VeiculoResponse toVeiculoResponse(Veiculo veiculo){

        VeiculoResponse response = new VeiculoResponse(veiculo.getId(),veiculo.getAnoVeiculo(), veiculo.getPlaca(), veiculo.getLicenciamento());

        return response;

    }

}
