package Projects.ArrayListStudies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bakery{
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
