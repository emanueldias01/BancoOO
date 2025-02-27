package edu.dio.bank.domain;

public abstract class Conta implements IConta{
    private Banco banco;
    private final int numeroAgencia = 1;
    private int id;

    private Double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente, Banco banco){
        this.banco = banco;
        this.cliente = cliente;
        this.id = this.getBanco().contas.size() + 1;
        this.saldo = 0d;
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

    public void exibeInfoConta(){
        System.out.printf("""
                Agencia: %d
                Cliente: %s
                IdConta: %d
                Saldo: %.2f
                """, this.getNumeroAgencia(), this.getCliente(), this.getId(), this.getSaldo());
    }
}
