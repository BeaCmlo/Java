package lives.CalculateAge.src;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine(); // tipo de entrada 03/10/2004

        String[] parts = data.split("/");
        int days = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);


        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, days);
        int years = Period.between(birthDate, today).getYears();

        System.out.println(years + " years");
    }
}