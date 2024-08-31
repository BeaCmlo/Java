package udemy.rectangle.entities;

public class rectangle {
    
    public double height;
    public double widht;

    
    public String perimether(double height, double widht){
        
        double perimeter = (2*height) + (2*widht);

        return "PERIMETHER = "
        + String.format("%.2f", perimeter);
    }

    public String area(double height, double widht){

        double area = height * widht;
        
        return "AREA = "
        + String.format("%.2f", area);
    }

    public String diagonal(double height, double widht){
        
        double diagonal = Math.sqrt((Math.pow(height, 2)) + (Math.pow(widht, 2)));

        return "DIAGONAL = "
        + String.format("%.2f", diagonal);
    }

}
