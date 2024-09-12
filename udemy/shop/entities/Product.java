package udemy.shop.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name; // Referência "this" ao atrinuto do objeto
        this.price = price; // Referência "this" ao atrinuto do objeto
        this.quantity = quantity; // Referência "this" ao atrinuto do objeto
    }

    public Product(String name, double price) { // Sobrecarga
        this.name = name;
        this.price = price;
    }


    public double totalValueInStock(){

        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){   
        return name 
        + ", $ " 
        + String.format("%.2f", price) + ", "
        + quantity + " units, Total: $ "  + String.format("%.2f", totalValueInStock());
    }
}
