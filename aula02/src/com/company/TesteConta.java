package com.company;

public class TesteConta {
    /**
     *
     * @author Lucas Martins
     */

        public static void main(String[] args) {

            Conta conta = new Conta();
            conta.numero = 15769;
            conta.saldo = 3500;
            conta.limite = 5.000;
            conta.especial = false;


            conta.imprimirSaldo();
            int novo = conta.sacarValor();
            System.out.println("seu novo saldo é: " + novo);
            conta.chequeEspecial();
            conta.depositar();
            conta.saldoAtualizado();

        }

    }



