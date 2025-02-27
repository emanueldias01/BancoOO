package edu.dio.bank.domain;

public class Conta implements IConta{
    private Banco banco;
    private final int numeroAgencia = 1;
    private int id;

    private Double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.id = this.getBanco().contas.size() + 1;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    protected Double getSaldo() {
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
