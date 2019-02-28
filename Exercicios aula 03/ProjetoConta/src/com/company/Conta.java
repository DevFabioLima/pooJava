package com.company;

import java.util.Scanner;

public class Conta {
    Scanner ler = new Scanner(System.in);
    String conta;
    String agencia;
    int saldo ;
    String nomeCliente;
    int valor;
    int deposito;

    public int sacar() {
        System.out.println("digite o valor que quer sacar : ");
        valor = ler.nextInt();

        if (saldo < valor){
            return 0;
        }else {
            saldo = saldo - valor;
            return 1;
        }
    }
   public void  depositar(){
        System.out.println("digite o valor que quer depositar : ");
        deposito=ler.nextInt();
        saldo= deposito + saldo;
    }
    public void imprimir(){
        System.out.println("Seu nome eh !! " + nomeCliente);
        System.out.println("Sua conta eh " + conta);
        System.out.println("Sua agencia eh  " + agencia);
        System.out.println("Seu saldo eh " + saldo);


    }
}

