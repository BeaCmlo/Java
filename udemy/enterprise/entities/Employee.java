package udemy.enterprise.entities;

public class Employee {

    public String name;
    public double salary;
    public double tax;

    public double HowMuchIsYourSalary(){
    
        this.salary -= this.tax;
        
        return salary;
    }
    public double IncreaseSalary(double porcentage){
        
        double increase = salary * (porcentage/100);
        
        salary += increase;
        
        return salary;
    }

    public String toString(){
        return "Employee: " + name 
        + ", R$ " + String.format("%.2f", salary);
    }
    
}
