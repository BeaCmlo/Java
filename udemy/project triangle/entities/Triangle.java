package udemy.project.triangle.entities;

public class Triangle{

    public double sideA;
    public double sideB;
    public double sideC;

    public double Area(double A, double B, double C){
        
        double p = ((A + B + C)/2);

        double result = Math.sqrt(p*(p - A)*(p - B)* (p - C));

        return result;
    }

}