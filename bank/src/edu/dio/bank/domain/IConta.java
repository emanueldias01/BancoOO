package edu.dio.bank.domain;

public interface IConta {
    void sacar(Double valor);
    void transferir(Double valor, Conta conta);
    void depositar(Double valor);
    void verificarSaldo();
}
