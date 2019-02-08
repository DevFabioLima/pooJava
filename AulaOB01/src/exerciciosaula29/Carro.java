/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaula29;

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
    //construtor com paramentros 
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
    marca = marca_;
    modelo = modelo_;
    numPassageiros = numPassageiros_;
    capCombustivel = capCombustivel_;
    consumoCombustivel = consumoCombustivel_;
    
    }

    Carro() {
        System.out.println("a classe foi instanciada");
        numPassageiros = 4;
    }
    
    
    
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
    

