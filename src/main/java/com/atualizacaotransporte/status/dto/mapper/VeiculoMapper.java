package com.atualizacaotransporte.status.dto.mapper;

import com.atualizacaotransporte.status.dto.request.VeiculoRequest;
import com.atualizacaotransporte.status.dto.request.VeiculoSaveRequest;
import com.atualizacaotransporte.status.dto.response.VeiculoResponse;
import com.atualizacaotransporte.status.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoMapper {

    public static Veiculo toVeiculo(VeiculoRequest request) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(request.getPlaca().toUpperCase());

        return veiculo;
    }

    public static VeiculoResponse toVeiculoResponse(Veiculo veiculo) {

        VeiculoResponse response = new VeiculoResponse(veiculo.getId(), veiculo.getAnoVeiculo(), veiculo.getPlaca().toUpperCase(), veiculo.getLicenciamento());

        return response;

    }

    public static List<VeiculoResponse> toVeiculoListResponse(List<Veiculo> veiculoListdo) {
        List<VeiculoResponse> veiculoList = new ArrayList<>();

        for (Veiculo veiculo : veiculoListdo) {
            VeiculoResponse response = toVeiculoResponse(veiculo);
            veiculoList.add(response);
        }

        return veiculoList;


    }

    public static Veiculo toVeiculoSave(VeiculoSaveRequest request) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(request.getPlaca().toUpperCase());
        veiculo.setAnoVeiculo(request.getAnoVeiculo());
        veiculo.setLicenciamento(request.getLicenciamento());

        return veiculo;
    }
}
