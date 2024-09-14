package Projects.ArrayListStudies;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static class Bakery{
        private String name;
        private int numsOfBreads;
        private int numsOfDrinks;
        private ArrayList<String> breads;
        private ArrayList<String> drinks;
        private Map<Double, String> menu;

        public Bakery(String name, int numsOfBreads, int numsOfDrinks, ArrayList<String> breads, ArrayList<String> drinks) {
            this.name = name;
            this.breads = breads;
            this.drinks = drinks;
            this.numsOfBreads = numsOfBreads;
            this.numsOfDrinks = numsOfDrinks;
        }

        @Override
        public String toString() {
            return "Bakery{" +
                    "name='" + name + '\'' +
                    ", breads=" + breads +
                    ", drinks=" + drinks +
                    ", menu=" + menu +
                    '}';
        }
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of your bakery: ");
        String name = sc.nextLine();

        ArrayList<String> breads = new ArrayList<>();
        System.out.print("Enter the number of breads: ");
        int numsOfBreads = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the breads: ");
        for (int i = 0; i < numsOfBreads; i++) {
            breads.add(sc.nextLine());
        }
        /*for (int i = 0; i < numsOfBreads; i++) {
            System.out.print(breads.get(i));
            if (i != numsOfBreads - 1) {
                System.out.print(", ");
            }
        }*/
        System.out.print("Enter the number of drinks: ");
        int numsOfDrinks = sc.nextInt();
        sc.nextLine();

        ArrayList<String> drinks = new ArrayList<>();
        System.out.println("Enter the drinks: ");
        for (int i = 0; i < numsOfDrinks; i++) {
            drinks.add(sc.nextLine());
        }
        Bakery bakery = new Bakery(name, numsOfBreads, numsOfDrinks, breads, drinks);


        // continued
    }
}


