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
    public ResponseEntity<?> salvar(@RequestBody @Valid CondutorRequest request) {

        if (request.getPlaca() == null) {
            Condutor modelo = CondutorMapper.toCondutor(request);
            Condutor modeloSalvo = service.salvar(modelo).getBody();
            CondutorResponse response = CondutorMapper.toCondutorResponse(modeloSalvo);

            return new ResponseEntity<>(response, HttpStatus.CREATED);

        }

        Condutor modelo = CondutorMapper.toCondutorCaminhao(request);
        Condutor modeloSalvo = service.salvar(modelo).getBody();
        CondutorAtualizadoResponse response = CondutorMapper.toCondutorAtualizadoResponse(modeloSalvo);

        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<CondutorAtualizadoResponse>> buscar(@RequestBody @Valid CondutorFindRequest request){

        List<Condutor> condutor = service.buscar(request.getRegistroCnh()).getBody();
        List<CondutorAtualizadoResponse> condutorResponseList = CondutorMapper.toCondutorResponse(condutor);

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