package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Justifier2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the number of lines: ");
                int numberOfLines = sc.nextInt();
                sc.nextLine();  

                if (numberOfLines == 0) {
                    break;
                }

                List<String> lines = readLines(sc, numberOfLines);
                int maxLength = getMaxLength(lines);
                printJustifiedLines(lines, maxLength);
                System.out.println(); 
            }
        }
    }

    private static List<String> readLines(Scanner sc, int numberOfLines) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
            String line = sc.nextLine().trim().replaceAll("\\s+", " ");
            lines.add(line);
        }
        return lines;
    }

    private static int getMaxLength(List<String> lines) {
        int maxLength = 0;
        for (String line : lines) {
            maxLength = Math.max(maxLength, line.length());
        }
        return maxLength;
    }

    private static void printJustifiedLines(List<String> lines, int maxLength) {
        for (String line : lines) {
            System.out.printf("%" + maxLength + "s\n", line);
        }
    }
}
