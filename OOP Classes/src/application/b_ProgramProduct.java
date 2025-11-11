package application;


import entities.b_Product;

import java.util.Locale;
import java.util.Scanner;

public class b_ProgramProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();


        System.out.print("Price: ");
        double price = sc.nextDouble();
        b_Product product = new b_Product(name, price);

        product.setName("Computer");

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println("Updated name: " + product.getName());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();


    }

}
