import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pessoas> pessoas = new HashSet<>();
        Pessoas Joao = new Pessoas("João",1);
        pessoas.add(Joao);
        Pessoas Maria = new Pessoas("Maria",2);
        pessoas.add(Maria);

        for (Pessoas pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
        pessoas.add(Joao);
        System.out.println("-------------------------");
        for (Pessoas pessoa : pessoas) {
            System.out.println(pessoa.getNome()); // Não imprime a classe Joao duas vezes
        }
    }
}