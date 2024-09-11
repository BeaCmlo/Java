import java.util.ArrayList;
import java.util.Scanner;

public class StaticMethods {
    static String phase(){
        return "That´s a phase that a can use in main without needing an Object";
    }
    static ArrayList ItsEven(ArrayList<Integer> nums, int nums_quantity){
        ArrayList<Integer> colletionsEven = new ArrayList<>();
        int count = 0;

            for (int i = nums.size() - 1; i >= 0; i--) {
                if (nums.get(i) % 2 == 0) {
                    colletionsEven.add(nums.get(i));
                    ++count;
                }
                if(count == nums_quantity){
                    break;
                }

            }
        return colletionsEven;
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

        ArrayList<Integer> finalNums = ItsEven(inputNums, howManyNums);

        System.out.print("You got it your last even numbers:\n[");
        for (int i = 0; i < finalNums.size(); ++i) {
            System.out.print(finalNums.get(i) + "");
            if (i != finalNums.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        sc.close();
    }

}
