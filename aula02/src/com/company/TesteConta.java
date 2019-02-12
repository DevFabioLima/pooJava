package com.company;
import java.util.Scanner;

public class TesteConta {
    /**
     *
     * @author Lucas Martins
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Conta conta = new Conta();
            conta.numero = 15769;
            conta.saldo = 3500;
            conta.limite = 5.000;
            conta.especial = false;
            int escolha = 10;


            do {
                System.out.println("|Digite 1 para sacar |");
                System.out.println("|Digite 2 para depositar|");
                System.out.println("|Digite 3 para consultar saldo|");
                System.out.println("|Digite 0 para consultar sair|");
                 escolha = scan.nextInt();

                switch (escolha){

                    case 1:
                        int novo = conta.sacarValor();
                        System.out.println("seu novo saldo é: " + novo);
                        conta.chequeEspecial();
                        continue;

                    case 2: conta.depositar();
                        conta.chequeEspecial();

                    case 3: conta.imprimirSaldo();
                }

            }while (escolha != 0);{

            }

             //conta.imprimirSaldo();
            //conta.imprimirSaldo();
            //int novo = conta.sacarValor();
            //System.out.println("seu novo saldo é: " + novo);
            //conta.chequeEspecial();
            //conta.depositar();
           //conta.saldoAtualizado();

        }

    }



