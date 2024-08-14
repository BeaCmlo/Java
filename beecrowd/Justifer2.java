package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Justifer2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfLines;

        while (true) {
            
        System.out.println("Enter the number of lines: ");

        numberOfLines = sc.nextInt();
        sc.nextLine();

        if(numberOfLines == 0){ break;}

        List<String> lines = new ArrayList<>();
        int maxLength = 0;

        for(int i = 0; i < numberOfLines; i++){
 
            String line = sc.nextLine().trim().replaceAll("\\s+", " ");
            lines.add(line);
            if(line.length() > maxLength){
                maxLength = line.length();
            }
        }
        for(String line : lines){
            System.out.printf("%" + maxLength + "s\n", line);
        }
        System.out.println();
    }
        sc.close();

    }
}
