package applications;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter student scores: ");
        student.av1 = sc.nextDouble();
        student.av2 = sc.nextDouble();
        student.av3 = sc.nextDouble();

        student.avarege();

        System.out.println(student);

    }
}