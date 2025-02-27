package edu.dio.bank.domain;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void verificarSaldo() {
        System.out.println("Saldo conta corrente: " + this.getSaldo());
    }
}
