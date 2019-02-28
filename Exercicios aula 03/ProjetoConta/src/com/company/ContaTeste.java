package com.company;

import java.util.Scanner;

public class ContaTeste {
    Scanner scan = new Scanner(System.in);

    Conta conta = new Conta();
    public void execSacar(){
        int result = conta.sacar();
        //System.out.println(conta.saldo);
        if(result == 1){
            System.out.println("Saque realizado com sucesso");
        }if(result == 0){
            System.out.println(" Saque nao realizado");
        }
    }
    public void execDepositar(){
        conta.depositar();

    }

    public void execConsultar(){
        conta.imprimir();
    }
    public void execCadastrar(){
        conta.imprimir();
        System.out.println("Digite o nome ");
        conta.nomeCliente = scan.nextLine();
        System.out.println("Digite a conta ");
        conta.conta = scan.nextLine();
        System.out.println("Digite a agencia ");
        conta.agencia = scan.nextLine();
        System.out.println("Digite o saldo ");
        conta.saldo = scan.nextInt();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta = new Conta();
        ContaTeste contaTeste = new ContaTeste();

        int escolha = 10;

        do {
            System.out.println("|Digite 1 para sacar |");
            System.out.println("|Digite 2 para depositar|");
            System.out.println("|Digite 3 para consultar|");
            System.out.println("|Digite 4 para cadastrar|");
            System.out.println("|Digite 0 para sair|");
            escolha = scan.nextInt();

            switch (escolha) {


                case 1: contaTeste.execSacar();

                break;

                case 2: contaTeste.execDepositar();
                break;

                case 3:contaTeste.execConsultar();
                break;

                case 4: contaTeste.execCadastrar();
            }

        }while (escolha != 0);{

        }
    }
}