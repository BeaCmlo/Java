
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Pessoas, Long> mapa;
        mapa = new HashMap<>();
        Pessoas Joao = new Pessoas("João", 1);
        Pessoas Carlos = new Pessoas("Carlos", 2);
        Pessoas Paulo = new Pessoas("Paulo", 3);
        Pessoas Carlota = new Pessoas("Carlota", 4);

        mapa.put(Joao,1L);
        mapa.put(Carlos, 2L);
        mapa.put(Paulo, 3L);
        mapa.put(Carlota, 4L);

        System.out.println(mapa); // Imprime do último ao primeiro

    }
}