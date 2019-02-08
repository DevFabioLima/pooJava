package com.company;


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
        Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
            this.marca = marca;
            this.modelo = modelo;
            this.numPassageiros = numPassageiros;
            this.capCombustivel = capCombustivel;
            this.consumoCombustivel = consumoCombustivel;

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



