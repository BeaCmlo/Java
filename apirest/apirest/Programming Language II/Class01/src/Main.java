import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanenr;
        Locale.setDefault(Locale.US);

        System.out.print("Enter a Integer: ");
        int inputInterger = sc.nextInt();

        System.out.print("Enter a Integer Array: ");
        System.out.println();

        int[] inputArray = new int[inputInterger];

        for (int position = 0; position < inputInterger; position++) {
            inputArray[position] = sc.nextInt();
        }
        sc.nextLine();

        System.out.println("Enter a String: ");
        String inputString = sc.nextLine();
        System.out.println();

        LearningBasics learn = new  LearningBasics(inputInterger,inputArray,inputString); // Create Object

        System.out.println(learn);
        System.out.println();
        sc.close();
    }
}