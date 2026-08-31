package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public double IncreaseSalary(double p){
        double increase = (grossSalary - tax) + (grossSalary * p)/100.0;
        return increase;
    }

}
