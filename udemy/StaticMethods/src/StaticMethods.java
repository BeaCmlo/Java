import java.util.ArrayList;
import java.util.Scanner;

public class StaticMethods {

    static String phase() {
        return "That´s a phase that I can use in main without needing an Object";
    }

    static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> nums, int nums_quantity) {
        ArrayList<Integer> collectionsEven = new ArrayList<>();
        int count = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) % 2 == 0) {
                collectionsEven.add(nums.get(i));
                ++count;
            }
            if (count == nums_quantity) {
                break;
            }
        }
        return collectionsEven;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(phase());

        System.out.println("Enter the numbers you wish to see the last even numbers. Type 'X' to finish");

        ArrayList<Integer> inputNums = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("X")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                inputNums.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'X' to finish.");
            }
        }

        System.out.println("Now, enter how many numbers you wish to see: ");
        int howManyNums = sc.nextInt();

        ArrayList<Integer> finalNums = getEvenNumbers(inputNums, howManyNums);


        ResultPrinter printer = new ResultPrinter(finalNums);
        System.out.println(printer);

        sc.close();
    }
}


class ResultPrinter {
    private ArrayList<Integer> numbers;

    public ResultPrinter(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("You got it your last even numbers:\n[");
        for (int i = 0; i < numbers.size(); ++i) {
            sb.append(numbers.get(i));
            if (i != numbers.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
