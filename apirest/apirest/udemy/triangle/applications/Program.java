package udemy.triangle.applications;
import java.util.Locale;
import java.util.Scanner;
import udemy.triangle.entities.Triangle;

public class Program{
    public static void main(String[] args){

    Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Triangle X, Y;
            X = new Triangle();
            Y = new Triangle();
            System.out.println("Enter the measures of triangle X: ");
            X.sideA = sc.nextDouble();
            X.sideB = sc.nextDouble();
            X.sideC = sc.nextDouble();
            System.out.printf("The measures of triangle X are:\n %.2f%n %.2f%n %.2f%n", X.sideA, X.sideB, X.sideC);
            System.out.printf("Enter de measures of trinagle Y: ");
            Y.sideA = sc.nextDouble();
            Y.sideB = sc.nextDouble();
            Y.sideC = sc.nextDouble();
            double areaX = X.Area(X.sideA, X.sideB, X.sideC);
            System.out.printf("Area of triangle X: %.4f%n", areaX);
        }
    }
}