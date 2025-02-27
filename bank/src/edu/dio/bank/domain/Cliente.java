package edu.dio.bank.domain;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Cliente(String cpf, LocalDate dataNascimento, String nome) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " CPF:" + this.getCpf() + " Data de nascimento: " + this.getDataNascimento();
    }
}
