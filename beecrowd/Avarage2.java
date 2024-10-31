package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Avarage2{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double A, B, C;
        double MEDIA;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter tbe measures: ");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        MEDIA = ((A*2) + (B*3) + (C*5))/3;

        System.out.printf("MEDIA = %.1f%n", MEDIA);

        sc.close();

        // pequeno comentário
    }
}