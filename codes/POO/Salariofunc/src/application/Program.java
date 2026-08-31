package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee one = new Employee();
    System.out.println("Name: \nGross salary: \nTax: \n");


    one.name = sc.nextLine();
    one.grossSalary = sc.nextDouble();
    one.tax = sc.nextDouble();

    System.out.printf("Employee: %s, $ %.2f\n", one.name, one.NetSalary());

    System.out.println("Which percentage to increase salary?\n");
    double p = sc.nextDouble();

    System.out.printf("Updated data: %s, $ %.2f\n", one.name, one.IncreaseSalary(p));

    sc.close();
}
}
