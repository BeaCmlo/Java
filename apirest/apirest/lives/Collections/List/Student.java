import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                "\ngrades: " + grades;
    }
}
