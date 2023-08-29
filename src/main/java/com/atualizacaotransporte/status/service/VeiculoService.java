package com.atualizacaotransporte.status.service;

import com.atualizacaotransporte.status.exception.VeiculoException;
import com.atualizacaotransporte.status.model.Veiculo;
import com.atualizacaotransporte.status.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public ResponseEntity<List<Veiculo>> buscar(String placa) {

        List<Veiculo> veiculoPesquisado = repository.findByPlaca(placa);

        if (veiculoPesquisado.size() == 0)
            throw new VeiculoException("Veiculos não cadastrado");

        return new ResponseEntity<List<Veiculo>>(veiculoPesquisado, HttpStatus.OK);

    }

    public ResponseEntity<Veiculo> salvar(Veiculo veiculoRequest) {

        List<Veiculo> pesquisaVeiculo = repository.findByPlaca(veiculoRequest.getPlaca());

        if (pesquisaVeiculo.size() == 1) {
            throw new VeiculoException("Veiculo ja cadastrado: " + veiculoRequest.getPlaca().toUpperCase());
        } else {
            veiculoRequest = repository.save(veiculoRequest);
        }

        return new ResponseEntity<Veiculo>(veiculoRequest, HttpStatus.CREATED);

    }
}
