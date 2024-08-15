package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Justifier2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // melhora a performance do programa
            while (true) {
                System.out.print("Enter the number of lines: ");
                int numberOfLines = sc.nextInt();
                sc.nextLine();  

                if (numberOfLines == 0) {
                    break;
                }

                List<String> lines = new ArrayList<>();
                int maxLength = 0;

                
                for (int i = 0; i < numberOfLines; i++) {
                    String line = sc.nextLine().trim().replaceAll("\\s+", " ");
                    lines.add(line);
                    maxLength = Math.max(maxLength, line.length());
                }

                
                for (String line : lines) {
                    System.out.printf("%" + maxLength + "s\n", line);
                }

                System.out.println(); 
            }
        }
    }
}
