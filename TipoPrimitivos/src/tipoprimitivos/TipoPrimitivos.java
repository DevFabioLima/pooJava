/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoprimitivos;

import java.util.Scanner;

/**
 *
 * @author Lucas Martins
 */
public class TipoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do alunoo ");
        String nome = teclado.nextLine();
        System.out.println("digite a nota do aluno ");
        float nota = teclado.nextFloat();
        
        System.out.printf("a  nota de %s élu %.2f \n", nome,nota);
    }
    
}
