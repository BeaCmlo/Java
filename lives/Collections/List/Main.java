import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> studentsList = new ArrayList<>();
        System.out.println("Enter how many students: ");
        int numOfRepetions = sc.nextInt();

        for (int i = 0; i < numOfRepetions; i++) {
            System.out.println("Enter student name: ");
            String name = sc.next();

            ArrayList<Double> grades = new ArrayList<>();
            System.out.println("Enter student grades: ");
            System.out.println("Av1: ");
            double firstGrade = sc.nextDouble();
            grades.add(firstGrade);

            System.out.println("Av2: ");
            double secoundGrade = sc.nextDouble();
            grades.add(secoundGrade);

            System.out.println("Av3: ");
            double thirdGrade = sc.nextDouble();
            grades.add(thirdGrade);

            Student student = new Student(name, grades);

            studentsList.add(student);
        }
        for (Student student :studentsList) {
            System.out.println(student);
        }
    }
}
