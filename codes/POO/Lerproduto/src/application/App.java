package application;

import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        // declarando uma variavel do tipo produto
        Produto product = new Produto();
            System.out.println("Enter product data:  ");
            System.out.println("Name:  ");
        product.name = sc.nextLine();
        
        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        

        System.out.println("\nProduct data: "+ product);
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\n Updated data: "+ product);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);
        sc.close();
    }
}
