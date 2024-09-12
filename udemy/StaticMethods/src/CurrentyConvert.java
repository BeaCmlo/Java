import java.util.Locale;
import java.util.Scanner;

public class CurrentyConvert {

    public static double ConvertReais(double DolarPrice, double HowManyDolares){

        return DolarPrice * (HowManyDolares + (HowManyDolares * 0.06));
    }



    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Dolar Price: ");
        double DolarPrice = sc.nextDouble();
        System.out.print("Enter the value of How Many Dolares: ");
        double HowManyDolares = sc.nextDouble();

        double TotalReais = CurrentyConvert.ConvertReais(DolarPrice, HowManyDolares);

        System.out.printf("Amount to be paid in reais = %.2f%n", TotalReais);
        sc.close();

    }
}
