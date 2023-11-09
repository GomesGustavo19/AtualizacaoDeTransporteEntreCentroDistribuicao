package com.atualizacaotransporte.status.dto.mapper;

import com.atualizacaotransporte.status.dto.request.CondutorRequest;
import com.atualizacaotransporte.status.dto.request.CondutorSaveRequest;
import com.atualizacaotransporte.status.dto.response.CondutorAtualizadoResponse;
import com.atualizacaotransporte.status.dto.response.CondutorResponse;
import com.atualizacaotransporte.status.dto.response.VeiculoResponse;
import com.atualizacaotransporte.status.exception.response.CondutoResponse;
import com.atualizacaotransporte.status.model.Condutor;
import com.atualizacaotransporte.status.model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CondutorMapper {
    public static Condutor toCondutor(CondutorRequest request) {
        Condutor condutor = new Condutor();
        condutor.setNome(request.getNome());
        condutor.setRegistroCnh(request.getRegistroCnh());
        condutor.setVencCnh(request.getVencCnh());
        condutor.setVencToxicologico(request.getVencToxicologico());

        return condutor;
    }

    public static Condutor toCondutorCaminhao(CondutorRequest request) {
        Condutor condutor = new Condutor();
        condutor.setId(request.getId());
        condutor.setNome(request.getNome());
        condutor.setRegistroCnh(request.getRegistroCnh());
        condutor.setVencCnh(request.getVencCnh());
        condutor.setVencToxicologico(request.getVencToxicologico());
        condutor.setPlaca(request.getPlaca().toUpperCase());

        return condutor;
    }

    public static CondutorResponse toCondutorResponse(Condutor condutor) {
        CondutorResponse response = new CondutorResponse();
        response.setId(condutor.getId());
        response.setNome(condutor.getNome());
        response.setRegistroCnh(condutor.getRegistroCnh());
        response.setVencCnh(condutor.getVencCnh());
        response.setVencToxicologico(condutor.getVencToxicologico());

        return response;

    }
    public static CondutorAtualizadoResponse toCondutorAtualizadoResponse(Condutor condutor) {
        CondutorAtualizadoResponse response = new CondutorAtualizadoResponse();
        response.setId(condutor.getId());
        response.setNome(condutor.getNome());
        response.setRegistroCnh(condutor.getRegistroCnh());
        response.setVencCnh(condutor.getVencCnh());
        response.setVencToxicologico(condutor.getVencToxicologico());
        response.setVeiculo(VeiculoMapper.toVeiculo(condutor.getVeiculo()));

        return response;

    }

    public static List<CondutorAtualizadoResponse> toCondutorResponse(List<Condutor> condutorList) {

        List<CondutorAtualizadoResponse> responseList = new ArrayList<>();
        for (Condutor condutor : condutorList) {
            CondutorAtualizadoResponse response = CondutorMapper.toCondutorAtualizadoResponse(condutor);
            responseList.add(response);

        }
        return responseList;

    }

    public static Optional<CondutorAtualizadoResponse> toCondutorResponse(Optional<Condutor> condutorOptionalsponse) {

        Optional<CondutorAtualizadoResponse> response = null;
        response.get().setId(condutorOptionalsponse.get().getId());
        response.get().setNome(condutorOptionalsponse.get().getNome());
        response.get().setRegistroCnh(condutorOptionalsponse.get().getRegistroCnh());
        response.get().setVencCnh(condutorOptionalsponse.get().getVencCnh());
        response.get().setVencToxicologico(condutorOptionalsponse.get().getVencToxicologico());
        response.get().setVeiculo(VeiculoMapper.toVeiculo(condutorOptionalsponse.get().getVeiculo()));

        return response;

    }

}
