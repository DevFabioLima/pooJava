package aula01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Martins
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; 
    //criando metodo abaixo 
    void exibirAutonomia(){
    
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    
    }
    //imprimindo usando metodo com retorno
    double obterAutonomia(){
        System.out.println("o metodo foi chamado");
        return capCombustivel * consumoCombustivel;
    }
    //imprimindo usando metodo com parametro
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
        
    }
    
    
}
