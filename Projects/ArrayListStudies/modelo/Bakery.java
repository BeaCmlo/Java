package Projects.ArrayListStudies.modelo;

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
    private Map<Map<String,Double>, Map<String,Double>> menu;


    public Bakery(String name, int numsOfBreads, int numsOfDrinks, ArrayList<String> breads, ArrayList<String> drinks) {
        this.name = name;
        this.breads = breads;
        this.drinks = drinks;
        this.numsOfBreads = numsOfBreads;
        this.numsOfDrinks = numsOfDrinks;
        this.priceBreads = new HashMap<>();
        this.priceDrinks = new HashMap<>();
    }

    public Map<Map<String, Double>, Map<String, Double>> createMenu(Map<String, Double> priceBreads, Map<String, Double> priceDrinks) {

        return menu;
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
