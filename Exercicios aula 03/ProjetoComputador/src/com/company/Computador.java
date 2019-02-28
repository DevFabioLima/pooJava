package com.company;

import java.util.Scanner;

public class Computador {
    Scanner ler = new Scanner(System.in);
    String marca;
    String cor;
    String modelo;
    long numeroSerie;
    double preco;
    int valor;

    void imprimir(){
        System.out.println("A marca eh " + marca);
        System.out.println("A cor eh " + cor);
        System.out.println("A modelo eh " + modelo);
        System.out.println("O numero de serie eh " + numeroSerie);
        System.out.println("O preço eh " + preco);
    }

    void cacularValor(){
        if(marca == "HP"){
            preco += (preco*30)/100;
        }
        if(marca == "IBM"){
            preco += (preco*50)/100;
        }
    }
    int alterarValor(){
        System.out.println("digite um valor para alterar o preço : ");
        valor=ler.nextInt();
        if (valor > 0) {
            preco = valor;
            return 1;
        }else {
            return 0;
        }


    }
}
