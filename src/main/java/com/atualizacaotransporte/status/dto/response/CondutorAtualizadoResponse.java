package com.atualizacaotransporte.status.dto.response;

import com.atualizacaotransporte.status.dto.request.VeiculoRequest;
import com.atualizacaotransporte.status.dto.request.VeiculoSaveRequest;
import com.atualizacaotransporte.status.model.Veiculo;
import com.atualizacaotransporte.status.validation.constrains.PlacaCarro;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;
import java.util.List;

public class CondutorAtualizadoResponse {

    private Integer id;
    private String nome;
    private String registroCnh;
    private Date vencCnh;
    private Date vencToxicologico;
    private VeiculoSaveRequest veiculo;

    public CondutorAtualizadoResponse() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroCnh() {
        return registroCnh;
    }

    public void setRegistroCnh(String registroCnh) {
        this.registroCnh = registroCnh;
    }

    public Date getVencCnh() {
        return vencCnh;
    }

    public void setVencCnh(Date vencCnh) {
        this.vencCnh = vencCnh;
    }

    public Date getVencToxicologico() {
        return vencToxicologico;
    }

    public void setVencToxicologico(Date vencToxicologico) {
        this.vencToxicologico = vencToxicologico;
    }

    public VeiculoSaveRequest getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoSaveRequest veiculo) {
        this.veiculo = veiculo;
    }

}
