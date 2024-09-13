package udemy.shop.applications;

import java.util.Locale;
import java.util.Scanner;

import udemy.shop.entities.Product;
public class Program{
    public static void main(String[] args){
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);


       System.out.println("Enter product data: ");
       System.out.print("Name: ");
       String name = sc.nextLine();

       System.out.print("Price: ");
       double price = sc.nextDouble();

       /*
       *System.out.print("Quantity in stock: ");
       *int quantity = sc.nextInt();
       */
       Product product = new Product(name, price);

       product.setName("Computer");
       product.setPrice(1200.00);

       System.out.println("Updated name: " + product.getName());
       System.out.println("Updated name: " + product.getPrice());

       System.out.println();
       System.out.println("Product data: " + product);
       System.out.println();

       System.out.print("Enter the number of products to be added in stock: ");
       
       int quantityAdd = sc.nextInt();

       product.addProducts(quantityAdd);

       System.out.println();
       System.out.println("Updaded data: " + product);
       System.out.println();

       System.out.print("Enter the number of products to be remove in stock: ");
       

       int quantityRemove = sc.nextInt();
       product.removeProducts(quantityRemove);
       
       System.out.println();
       System.out.print("Updaded data: " + product);

       sc.close();
    }
}