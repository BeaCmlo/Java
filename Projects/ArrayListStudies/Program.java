package Projects.ArrayListStudies;

import java.util.*;

public class Program {

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
        /*for (int i = 0; i < numsOfBreads; i++) { // Debug
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

        Map<String, Double> priceBreads = new HashMap<>();
        for (String bread : breads){
            System.out.printf("Enter the price of the bread %s ", bread);
            double price = sc.nextDouble();
            priceBreads.put(bread, price);
        }
        Map<String, Double> priceDrinks = new HashMap<>();
        for(String drink : drinks){
            System.out.printf("Enter the price of the drink %s ", drink);
            double price = sc.nextDouble();
            priceDrinks.put(drink, price);
        }
        Map<String, Double> menu = new HashMap<>();
        for (Map.Entry<String, Double> entry : priceBreads.entrySet()){
            System.out.printf("Bread: %s", entry.getKey());
            System.out.printf(" - R$ %.2f ", entry.getValue());
            System.out.println();
        } // comment

        // continued
    }
}


