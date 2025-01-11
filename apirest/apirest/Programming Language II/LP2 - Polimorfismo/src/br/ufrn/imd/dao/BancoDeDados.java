package br.ufrn.imd.dao;
import java.util.ArrayList;

import br.ufrn.imd.modelo.Animal;
import br.ufrn.imd.modelo.Elefante;
import br.ufrn.imd.modelo.Girafa;

public class BancoDeDados {

    private ArrayList<Animal> animaisCadastrados;

    public BancoDeDados() {
        animaisCadastrados = new ArrayList<>();
    }

    public void adionarAnimal(Animal animal) {
        animaisCadastrados.add(animal);
    }
    public void exibirAnimaisCadastrados() {
        System.out.println();
        System.out.println("Animais Cadastrados");
        System.out.println("*********************************************");
        for (Animal animal : animaisCadastrados) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Alimentacao: " + animal.getAlimentacao());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println("Idade: ");
            System.out.println("Alimentado: " + animal.isAlimentado());
            System.out.println("*******************************************");
        }
    }

    public void exibirAlimentosTotais() {
        double totalAlimentos = 0;
        double totalFrutasVerduras = 0;
        double totalCarnes = 0;
        System.out.println();
        System.out.println("Alimentos totais");
        System.out.println();
        System.out.println("***********************************");

        for(Animal animal : animaisCadastrados) {
            System.out.println("Animal " + animal.getNome() + " se alimentou de " + animal.getQuantidadeAlimento() + " quilos.");
            totalAlimentos += animal.getQuantidadeAlimento();
            if (animal instanceof Girafa) {
                totalFrutasVerduras += animal.getQuantidadeAlimento();
            }
            else if(animal instanceof Elefante) {
                totalFrutasVerduras += animal.getQuantidadeAlimento();
            }
            else {
                totalCarnes += animal.getQuantidadeAlimento();
            }
        }
        System.out.println("Verduras e frutas totais: " + totalAlimentos);
        System.out.println("Carnes totais: " + totalAlimentos);
        System.out.println();
        System.out.println("Alimento total usado (Kg): " + totalAlimentos);
        System.out.println();
    }

    public void consultar(Animal animal) {
        System.out.println("CONSULTAS");
        System.out.println("Animal " + animal.getNome() + " foi consultado");

    }

    public void listarIdade(){
        for (Animal animal : animaisCadastrados) {
            System.out.println("Animal " + animal.getNome() + "tem " + animal.getIdade() + " anos");
        }
    }


}


