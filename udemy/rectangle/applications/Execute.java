package udemy.rectangle.applications;

import java.util.Locale;
import java.util.Scanner;
import udemy.rectangle.entities.rectangle;

public class Execute {

   public static void Main(String[] args){ 
       
    Locale.setDefault(Locale.US);
       try (Scanner sc = new Scanner(System.in)) {
           rectangle rectangle = new rectangle();
           
           System.out.println("Enter rectangle widht and height: ");
           rectangle.height = sc.nextDouble();
           rectangle.widht = sc.nextDouble();
           
           System.out.println();
           rectangle.area(rectangle.height, rectangle.widht);
           System.out.println();
           
           rectangle.perimether(rectangle.height, rectangle.widht);
           System.out.println();
           
           rectangle.diagonal(rectangle.height, rectangle.widht);
       }
   }
}
