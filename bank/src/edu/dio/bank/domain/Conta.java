package edu.dio.bank.domain;

public class Conta implements IConta{
    private final int numeroAgencia = 1;
    private int id;

    private Double saldo;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Double valor, Conta conta) {
        this.saldo -= valor;
        conta.depositar(valor);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void verificarSaldo() {
        System.out.println("Saldo: " + this.getSaldo());
    }
}
