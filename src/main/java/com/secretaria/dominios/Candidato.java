package com.secretaria.dominios;

public class Candidato {

    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = (int) (1 + (Math.random() * 100));;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
