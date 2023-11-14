package com.atualizacaotransporte.status.dto.request;

import com.atualizacaotransporte.status.model.Veiculo;

import java.util.Date;

public class CondutorSaveRequest {

    private String nome;
    private String registroCnh;
    private Date vencCnh;
    private Date vencToxicologico;
    private Veiculo veiculo_id;

    public CondutorSaveRequest(String nome, String registroCnh, Date vencCnh, Date vencToxicologico,Veiculo veiculo_id) {
        this.nome = nome;
        this.registroCnh = registroCnh;
        this.vencCnh = vencCnh;
        this.vencToxicologico = vencToxicologico;
        this.veiculo_id = veiculo_id;
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

    public Veiculo getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(Veiculo veiculo_id) {
        this.veiculo_id = veiculo_id;
    }
}
