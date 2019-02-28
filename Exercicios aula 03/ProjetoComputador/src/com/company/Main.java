package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Computador computador = new Computador();
        computador.marca = "HP";
        computador.preco = 100;
        computador.numeroSerie = 10203040;
        computador.cor = "Preto";
        computador.modelo = "X3";
        String opc;

        //computador.imprimir();
        computador.cacularValor();
        computador.imprimir();
        System.out.println("Deseja alterar o valor ? S/N");
        opc = scan.nextLine();
        if (opc.equals("S") ) {
            int result = computador.alterarValor();
            if (result == 0) {
                System.out.println("Valor nao alterado");
            }
            if (result == 1) {
                System.out.println("Valor alterado");
            }
            computador.imprimir();
        }
        else{

        }
    }
}
