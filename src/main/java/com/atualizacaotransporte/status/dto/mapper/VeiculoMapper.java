package com.atualizacaotransporte.status.dto.mapper;

import com.atualizacaotransporte.status.dto.request.VeiculoAtualizacaoRequest;
import com.atualizacaotransporte.status.dto.request.VeiculoRequest;
import com.atualizacaotransporte.status.dto.request.VeiculoSaveRequest;
import com.atualizacaotransporte.status.dto.response.VeiculoResponse;
import com.atualizacaotransporte.status.model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VeiculoMapper {

    public static Veiculo toVeiculo(VeiculoSaveRequest request) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(request.getPlaca().toUpperCase());
        veiculo.setAnoVeiculo(request.getAnoVeiculo());
        veiculo.setLicenciamento(request.getLicenciamento());

        return veiculo;
    }

    public static Veiculo toVeiculo(VeiculoAtualizacaoRequest request) {
        Veiculo veiculo = new Veiculo();
        veiculo.setId(request.getId());
        veiculo.setPlaca(request.getPlaca().toUpperCase());
        veiculo.setLicenciamento(request.getLicenciamento());
        return veiculo;
    }

    public static VeiculoSaveRequest toVeiculo(Veiculo request) {
        VeiculoSaveRequest veiculo = new VeiculoSaveRequest();

        veiculo.setId(request.getId());
        veiculo.setAnoVeiculo(request.getAnoVeiculo());
        veiculo.setPlaca(request.getPlaca());
        veiculo.setLicenciamento(request.getLicenciamento());
        
        return veiculo;
    }

    public static VeiculoResponse toVeiculoResponse(Veiculo veiculo) {

        VeiculoResponse response = new VeiculoResponse();
        response.setId(veiculo.getId());
        response.setAnoVeiculo(veiculo.getAnoVeiculo());
        response.setPlaca(veiculo.getPlaca().toUpperCase());
        response.setLicenciamento(veiculo.getLicenciamento());

        return response;

    }

    public static List<VeiculoResponse> toVeiculoResponse(List<Veiculo> veiculoListdo) {
        List<VeiculoResponse> veiculoList = new ArrayList<>();

        for (Veiculo veiculo : veiculoListdo) {
            VeiculoResponse response = toVeiculoResponse(veiculo);
            veiculoList.add(response);
        }

        return veiculoList;


    }

    public static Optional<VeiculoResponse> toVeiculoResponse(Optional<Veiculo> response) {
        Optional<VeiculoResponse> veiculo = null;
        veiculo.get().setPlaca(response.get().getPlaca().toUpperCase());
        veiculo.get().setAnoVeiculo(response.get().getAnoVeiculo());
        veiculo.get().setLicenciamento(response.get().getLicenciamento());

        return veiculo;

    }
}
