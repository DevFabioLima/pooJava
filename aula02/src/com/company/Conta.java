package com.company;
import java.util.Scanner;
    /**
     *
     * @author Lucas Martins
     */
    public class Conta {
        Scanner ler = new Scanner(System.in);
        int numero;
        int valor;
        int deposito;
        int saldo;
        boolean especial;
        double limite;

        Conta(int numero, int valor, int deposito, int saldo, boolean especial, double limite){
            this.saldo=saldo;
            this.numero=numero;
            this.valor=valor;
            this.deposito=deposito;
            this.especial=especial;
            this.limite=limite;

        }
        Conta(){
            System.out.println("A CLASSE FOI INSTANCIADA");
        }

        void imprimirSaldo(){
            System.out.println(" seu saldo é: " + saldo );
        }

        int  sacarValor(){
            System.out.println("digite o valor que quer sacar : ");
            valor=ler.nextInt();
            saldo = saldo - valor;
            return saldo;
        }

        void chequeEspecial(){
            if(valor > saldo){
                System.out.println("voce entrou no cheque especial !!");
            }
        }

        void  depositar(){
            System.out.println("digite o valor que quer depositar : ");
            deposito=ler.nextInt();
            saldo= deposito + saldo;
        }
        void saldoAtualizado(){
            System.out.println(" seu saldo é: " + saldo  );
        }

    }

