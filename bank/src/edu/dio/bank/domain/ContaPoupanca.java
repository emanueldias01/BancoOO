package edu.dio.bank.domain;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void verificarSaldo() {
        System.out.println("Saldo Conta Poupanca: " + this.getSaldo());
    }
}
