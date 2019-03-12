package com.company;

import java.util.Scanner;

public class Jogador {
    Scanner sc = new Scanner(System.in);
    public String numero;
    public String nome;
    public String idade;
    public String poiscao;
    public Jogador vetJogador[] = new Jogador[6];



    void CadastrarJogador(){
        int cont=1;
        for (int i = 0; i < 6 ; i++) {
        if(i < 6){
            vetJogador[i]= new Jogador();
            System.out.println("Digite o nome do Jogador numero " + cont);
            vetJogador[i].nome = sc.nextLine();
            System.out.println("Digite o numero do Jogador " + cont);
            vetJogador[i].numero = sc.nextLine();
           // System.out.println("Digite a idade do Jogador " + cont);
            //vetJogador[i].idade = sc.nextLine();
            //System.out.println("Digite a posicao do Jogador " + cont);
          // vetJogador[i].poiscao = sc.nextLine();
            cont++;
        }
        else{
            System.out.println("Todos Jogadores ja foram cadastrados");
        }

    }
    }
    public void Imprimir(){
        int n=1;
        for (int i = 0; i < 6 ; i++) {
            System.out.println("O nome do Jogador eh numero " + n + " eh= "  + vetJogador[i].nome);
            System.out.println(" O numero do Jogador " + n + " eh= " + vetJogador[i].numero);
            // System.out.println("A posição do jogador " + n + " eh = " + vetJogador[i].poiscao);
            // System.out.println(" a idade do jogador " + n + " eh = " + vetJogador[i].idade);
            n++;
        }

    }



    }

