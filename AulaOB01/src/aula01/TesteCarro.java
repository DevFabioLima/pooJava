/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author Lucas Martins
 */
public class TesteCarro {
    
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        //teste mais impressão
        System.out.println(van.marca);
        System.out.println(van.modelo);
        //imprindo metodo sem retorno usando void
        van.exibirAutonomia();
        
        // imprimindo usando metodo com retorno
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        
        //imprimindo usando metodo com paremetros
        double qtdCombustivel=van.calcularCombustivel(10);
        System.out.println("qtdCombustivel para 10 km é = " + qtdCombustivel);
    }
    
}
