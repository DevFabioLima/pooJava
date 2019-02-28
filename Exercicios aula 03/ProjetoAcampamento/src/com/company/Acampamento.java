package com.company;

public class Acampamento {
    String nome;
    char equipe;
    int idade;

    void imprimir(){
        if (idade<6) {
            System.out.println("Idade invalida");
        }
        System.out.println("o nome eh " + nome);
        System.out.println("A equipe eh " + equipe);
        System.out.println("A idade eh " + idade);
    }
    void separarGrupo(){

        if ((idade > 5) && (idade < 11)){
            equipe = 'A';
        }
        if((idade > 10)&& (idade < 21 )){
            equipe = 'B';

        }if (idade > 20) {
            equipe = 'C';

        }

    }

}
