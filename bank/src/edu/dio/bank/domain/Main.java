package edu.dio.bank.domain;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("12312312312", LocalDate.now(), "Emanuel");
        ContaCorrente contaCorrente = new ContaCorrente(cliente, banco);

        contaCorrente.exibeInfoConta();
    }
}
