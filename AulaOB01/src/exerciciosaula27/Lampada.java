/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaula27;

/**
 *
 * @author Lucas Martins
 */
public class Lampada {
    String modelo;
    String tensao; 
    int potencia; 
    String cor;
    String tipoLuz;
    int garantiaMeses;
    boolean tipoAbajur; 
    boolean ligada; 
    
    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("a lampada esta ligada");
        }else{
            System.out.println("a lampada esta desligada");
    }
    }
    
    void mudarEstado(){
        if(ligada){
        desligar();
    }else {
    ligar();
    
}
}
}
