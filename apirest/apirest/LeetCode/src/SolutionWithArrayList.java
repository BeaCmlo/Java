import java.util.ArrayList;
import java.util.Scanner;

public class SolutionWithArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Target =  ");
        int target = sc.nextInt();

        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        for (int positionEx = 0; positionEx < numbers.size() - 1; positionEx++) {
            for (int positionIn = positionEx + 1; positionIn < numbers.size(); positionIn++) {
                if (numbers.get(positionEx) + numbers.get(positionIn) == target) {
                    System.out.println("[" + positionEx + "," + positionIn + "]");
                }
            }

        }
    }
}
