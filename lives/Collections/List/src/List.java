package src;

import src.Pessoas;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // List
        ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();

        pessoas.add(new Pessoas("João", 1));

        Pessoas pessoa1 = pessoas.getFirst();

        pessoas.add(pessoa1);

        for(Pessoas pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        pessoas.add(pessoa1);

        for(Pessoas pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}