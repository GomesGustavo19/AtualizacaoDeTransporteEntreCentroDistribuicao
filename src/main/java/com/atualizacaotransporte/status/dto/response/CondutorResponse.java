package com.atualizacaotransporte.status.dto.response;

import com.atualizacaotransporte.status.model.Veiculo;

import java.util.Date;

public class CondutorResponse {

    private Integer id;
    private String nome;
    private String registroCnh;
    private Date vencCnh;
    private Date vencToxicologico;


    @Deprecated
    public CondutorResponse() {
    }

    public CondutorResponse(Integer id,String nome, String registroCnh, Date vencCnh, Date vencToxicologico) {
        this.id = id;
        this.nome = nome;
        this.registroCnh = registroCnh;
        this.vencCnh = vencCnh;
        this.vencToxicologico = vencToxicologico;
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

}
