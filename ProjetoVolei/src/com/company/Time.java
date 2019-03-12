package com.company;
import java.util.Scanner;

public class Time  {
    Scanner sc = new Scanner(System.in);


    public String id;
    public String nome;
    public int vetJogador;
    public Time vetTime[] = new Time[5];




    public void ListarJogadores(){
        Jogador jogador = new Jogador();

        jogador.Imprimir();




    }
    void CadastrarTime(){

            for (int i = 0; i < 6 ; i++) {
                if(i < 5){
                vetTime[i]= new Time();
                System.out.println("Digite o nome do time");
                vetTime[i].nome = sc.nextLine();
                    System.out.println("Digite o Id do time");
                    vetTime[i].id = sc.nextLine();
            }
                else{
                    System.out.println("Todos times ja foram cadastrados");
                }

        }
        }



    void ImprimirTime(){
        for (int i = 0; i < 5 ; i++) {

            System.out.println("O nome do time eh = "  + vetTime[i].nome + " e o id do time eh = " + vetTime[i].id);

        }

    }
}