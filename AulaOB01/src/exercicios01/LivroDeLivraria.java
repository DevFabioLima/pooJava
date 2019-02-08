/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios01;

/**
 *
 * @author Lucas Martins
 */
public class LivroDeLivraria {
    public static void main(String[] args) {
        Livro livraria = new Livro();
        livraria.genero = "ficção";
        livraria.nome = "harry potter";
        livraria.numPaginas = 200;
        livraria.disponivel = true;
        livraria.valor = 150;
        System.out.println(livraria.nome);
        System.out.println(livraria.disponivel);
        
    }
      
    
}
