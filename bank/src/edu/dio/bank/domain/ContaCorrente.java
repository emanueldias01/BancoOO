package edu.dio.bank.domain;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void verificarSaldo() {
        System.out.println("Saldo conta corrente: " + this.getSaldo());
    }
}
