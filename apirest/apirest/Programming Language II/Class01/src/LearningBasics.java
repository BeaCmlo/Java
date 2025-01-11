import java.util.Arrays;

public class LearningBasics{
    private int firstIntVarible; // Explicit data type and encapsulation
    private int[] ArrayVarible; // Explicit data type and encapsulation
    private String StringVarible; // Explicit data type and encapsulation


    LearningBasics(int firstIntVarible, int[] ArrayVarible, String StringVarible){ // This is a construtor, responsable to create to inicialize an object in Main
        this.firstIntVarible = firstIntVarible;
        this.ArrayVarible = ArrayVarible;
        this.StringVarible = StringVarible;
    }
    LearningBasics(int[] Array, String StringV){ // Another constructor with different parameters
        ArrayVarible = Array;
        StringVarible = StringV;
    }

    public String thatIsAMethod(String someString){
        return "Print: %s" + StringVarible;
    }


    @Override
    public String toString() {
        return "LearningBasics{" +
                "firstIntVarible=" + firstIntVarible +
                ", ArrayVarible=" + Arrays.toString(ArrayVarible) +
                ", StringVarible='" + StringVarible + '\'' +
                '}';
    } // Formated Output
}
