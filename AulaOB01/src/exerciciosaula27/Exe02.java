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
public class Exe02 {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.numero = 15769;
        conta.saldo = 3500;
        conta.limite = 5.000;
        conta.especial = false;
        
        
        conta.imprimirSaldo();
        int novo = conta.sacarValor();
        System.out.println("seu novo saldo é: " + novo);
        conta.chequeEspecial();
        conta.depositar();
        conta.saldoAtualizado();
        
        
    }
   
}
