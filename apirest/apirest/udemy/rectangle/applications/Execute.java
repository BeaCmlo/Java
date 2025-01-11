package udemy.rectangle.applications;

import java.util.Locale;
import java.util.Scanner;
import udemy.rectangle.entities.Rectangle;

public class Execute {

   public static void main(String[] args){
       
    Locale.setDefault(Locale.US);
       try (Scanner sc = new Scanner(System.in)) {
           Rectangle rectangle = new Rectangle();
           
           System.out.println("Enter rectangle widht and height: ");
           rectangle.height = sc.nextDouble();
           rectangle.widht = sc.nextDouble();
           System.out.println();           
        
           rectangle.area(rectangle.height, rectangle.widht);
           rectangle.perimether(rectangle.height, rectangle.widht);
           rectangle.diagonal(rectangle.height, rectangle.widht);

           System.out.println(rectangle);
           System.out.println();
       }
   }
}
