import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;

public class EstruturaDeDecisao {
    public static void main(String[] args) {

        //listaDePalavras();
        //forClassic();
        //forPure();
        invertedString();
    }

    private static void listaDePalavras() { // Extract methods (ctrl + alt + m)
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Games");
        palavrasList.add("Science");
        palavrasList.add("Computer Science");
        palavrasList.add("Design");
        palavrasList.add("Math");

        // Traditional repetition structure
        for (String palavra : palavrasList) {
            System.out.println(palavra);

        }
        System.out.println();

        // Repetition structure in functional programming
        palavrasList.forEach(palavra -> System.out.println(palavra)); // Lambda Function
    }

    private static void forClassic() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Games");
        palavrasList.add("Science");
        palavrasList.add("Computer Science");
        palavrasList.add("Design");
        palavrasList.add("Math");

        for(int position = 0; position < palavrasList.size(); position++) {
            System.out.println(palavrasList.get(position)); // More control
        }

    }

    private static void forPure(){
        for(int position = 0; position <= 10; position++) {
            System.out.println(position);
        }
    }

    private static void invertedString(){
        String normal = "12345";

        String inverted = "";

        for(int position = normal.length() - 1; position >= 0 ; position--) {
            inverted = inverted + normal.charAt(position);
        }
        System.out.println(inverted);
    }
}
