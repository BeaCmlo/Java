package entities;

public class Student {
    public String name;
    public double av1, av2, av3;
    private double avarage;
    private boolean pass;
    private double complement;

    public boolean avarege() {
        avarage = ((av1 * 30) + (av2 * 35) + (av3*35)/100);
        complement = (60 - avarage);
        if(avarage > 60){
            pass = true;
        }else{
            pass = false;
        }
        return pass;
    }

    @Override
    public String toString() {
        if (pass){
            return "Student: "+ name + "\nFINAL GRADE = " + String.format("%.2f", avarage) + "\nPASS";
        }else{
            return "Student: "+ name + "\nFINAL GRADE = " + String.format("%.2f", avarage) + "\nFAILED\nMISSING " + String.format("%.2f", complement) + " POINTS";
        }
    }
}