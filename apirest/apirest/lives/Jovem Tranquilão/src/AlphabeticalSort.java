import java.util.Scanner;

public class AlphabeticalSort {
    public static void main(String[] args) {

        String[] Boardgames;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many games: ");
        Boardgames = new String[sc.nextInt()];
        sc.nextLine();

        System.out.println("Enter board games:");
        for (int i = 0; i < Boardgames.length; i++) {
            Boardgames[i] = sc.nextLine();
        }

        for (int positionX = 0; positionX < Boardgames.length; positionX++) {
            for (int positionY = 0; positionY < Boardgames.length - 1; positionY++) {
                if (Boardgames[positionY].compareTo(Boardgames[positionY + 1]) > 0) {
                    String aux = Boardgames[positionY];
                    Boardgames[positionY] = Boardgames[positionY + 1];
                    Boardgames[positionY + 1] = aux;

                }
            }

        }

        for (String boardgames : Boardgames){
            System.out.println(boardgames);
        }

        sc.close();

    }
}