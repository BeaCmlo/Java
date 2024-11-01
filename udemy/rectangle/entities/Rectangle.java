package udemy.rectangle.entities;

public class Rectangle {
    
    public double height;
    public double widht;

    
    public double perimether(double height, double widht){
        
        double perimeter = (2*height) + (2*widht);

        return perimeter;
    }

    public double area(double height, double widht){

        double area = height * widht;
        
        return area;
    }

    public double diagonal(double height, double widht){
        
        double diagonal = Math.sqrt((Math.pow(height, 2)) + (Math.pow(widht, 2)));

        return diagonal;
    }
    public String toString(){
        return "Perimeter = " 
        + String.format("%.2f", perimether(height, widht))
        + "\nArea = " +  String.format("%.2f", area(height, widht)) 
        + "\nDiagonal = " +  String.format("%.2f", diagonal(height, widht));
    }

}