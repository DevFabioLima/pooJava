package com.company;

public class GerenciarTime {
   String vetTime[] = new String [5];


    int indice;

    public static void main(String[] args) {
        Time time = new Time();
        //time.CadastrarTime();
        //time.Imprimir();
        Jogador jogador = new Jogador();
        jogador.CadastrarJogador();
        //jogador.Imprimir();
        time.ListarJogadores();

    }
}
