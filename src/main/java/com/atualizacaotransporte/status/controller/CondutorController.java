package com.atualizacaotransporte.status.controller;

import com.atualizacaotransporte.status.dto.mapper.CondutorMapper;
import com.atualizacaotransporte.status.dto.request.CondutorFindRequest;
import com.atualizacaotransporte.status.dto.request.CondutorRequest;
import com.atualizacaotransporte.status.dto.response.CondutorAtualizadoResponse;
import com.atualizacaotransporte.status.dto.response.CondutorResponse;
import com.atualizacaotransporte.status.model.Condutor;
import com.atualizacaotransporte.status.service.CondutorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/condutor")
public class CondutorController {

    @Autowired
    private CondutorService service;

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody @Valid CondutorRequest request) {

        if (request.getVeiculo_id() == null) {
            Condutor modelo = CondutorMapper.toCondutor(request);
            Condutor modeloSalvo = service.salvar(modelo).getBody();

            String text = "Condutor " + modeloSalvo.getNome() + " salvo com sucesso";

            return new ResponseEntity<>(text, HttpStatus.CREATED);

        }

        Condutor modelo = CondutorMapper.toCondutorCaminhao(request);
        Condutor modeloSalvo = service.salvar(modelo).getBody();

        String text = "Condutor " + modeloSalvo.getNome() + " salvo com sucesso";

        return new ResponseEntity<>(text, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<CondutorAtualizadoResponse> buscar(@RequestBody @Valid CondutorFindRequest request){

        Condutor condutor = service.buscar(request.getRegistroCnh()).getBody();
        CondutorAtualizadoResponse condutorResponseList = CondutorMapper.toCondutorAtualizadoResponse(condutor);

        return new ResponseEntity<>(condutorResponseList, HttpStatus.OK);

    }

    @PutMapping
    public ResponseEntity<CondutorAtualizadoResponse> atualizar(@RequestBody @Valid CondutorRequest request) {
        Condutor model = CondutorMapper.toCondutor(request);
        Condutor modelAtualizado = service.atualizar(model).getBody();
        CondutorAtualizadoResponse response = CondutorMapper.toCondutorAtualizadoResponse(modelAtualizado);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}