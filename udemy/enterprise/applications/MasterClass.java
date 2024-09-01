package udemy.enterprise.applications;

import java.util.Locale;
import java.util.Scanner;
import udemy.enterprise.entities.Employee;

public class MasterClass {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.print("What is your name? ");
        employee.name = sc.nextLine();
        System.out.println();
        
        System.out.print("How much is your salary? ");
        employee.salary = sc.nextDouble();
        System.out.println();

        System.out.print("How much do you pay for tax? ");
        employee.tax = sc.nextDouble();
        System.out.println();

        employee.HowMuchIsYourSalary();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.println("Which porcentage to increase salary? ");
        
        double porcentage = sc.nextDouble();

        employee.IncreaseSalary(porcentage);

        System.out.println("Updated data: " + employee);
        System.out.println();
        
        sc.close();

    }
}

