package Projects.ArrayListStudies;

import java.util.*;

public class Program {
    public static class Bakery{
        private String name;
        private int numsOfBreads;
        private int numsOfDrinks;
        private ArrayList<String> breads;
        private ArrayList<String> drinks;
        private Map<String, Double> priceBreads;
        private Map<String, Double> priceDrinks;
        private Map<Map<String,Double>, Map<String,Double>> priceBreadsAndDrinks;


        public Bakery(String name, int numsOfBreads, int numsOfDrinks, ArrayList<String> breads, ArrayList<String> drinks) {
            this.name = name;
            this.breads = breads;
            this.drinks = drinks;
            this.numsOfBreads = numsOfBreads;
            this.numsOfDrinks = numsOfDrinks;
            this.priceBreads = new HashMap<>();
            this.priceDrinks = new HashMap<>();
        }

        public Map<String, Double> getPriceBreads() {

            return priceBreads;
        }
        public Map<String, Double> getPriceDrinks() {
            return priceDrinks;
        }
        public Map<Map<String, Double>, Map<String, Double>> getPriceBreadsAndDrinks() {

            return priceBreadsAndDrinks;
        }


        @Override
        public String toString() {
            return "Bakery{" +
                    "name='" + name + '\'' +
                    ", breads=" + breads +
                    ", drinks=" + drinks +
                    ", menu=" +
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

        Map<Double, String> priceBreads = new HashMap<>();
        for (String bread : breads){
            System.out.printf("Enter the price of the bread %s ", bread);
            double price = sc.nextDouble();
            priceBreads.put(price, bread);
        }
        Map<Double, String> priceDrinks = new HashMap<>();
        for(String drink : drinks){
            System.out.printf("Enter the price of the drink %s ", drink);
            double price = sc.nextDouble();
            priceDrinks.put(price, drink);
        }

        // continued
    }
}


