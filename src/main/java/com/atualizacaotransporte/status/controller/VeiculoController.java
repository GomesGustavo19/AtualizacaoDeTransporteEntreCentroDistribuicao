package com.atualizacaotransporte.status.controller;

import com.atualizacaotransporte.status.dto.mapper.VeiculoMapper;
import com.atualizacaotransporte.status.dto.request.VeiculoRequest;
import com.atualizacaotransporte.status.dto.request.VeiculoSaveRequest;
import com.atualizacaotransporte.status.dto.response.VeiculoResponse;
import com.atualizacaotransporte.status.model.Veiculo;
import com.atualizacaotransporte.status.service.VeiculoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public ResponseEntity<List<VeiculoResponse>> buscarVeiculo(@RequestBody @Valid VeiculoRequest request) {
        List<Veiculo> veiculoSalvo = service.buscar(request.getPlaca()).getBody();
        List<VeiculoResponse> response = VeiculoMapper.toVeiculoListResponse(veiculoSalvo);

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

    @PostMapping
    public ResponseEntity<VeiculoResponse> salvarVeiculo(@RequestBody @Valid VeiculoSaveRequest requestSave){
        Veiculo veiculo = VeiculoMapper.toVeiculoSave(requestSave);
        Veiculo veiculoSalvo = service.salvar(veiculo).getBody();
        VeiculoResponse response = VeiculoMapper.toVeiculoResponse(veiculoSalvo);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }


}