package application;

import entities.i_Product;

import java.util.Locale;
import java.util.Scanner;

public class i_Aula2Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        i_Product[] vect = new i_Product[n]; // vetor do tipo referência, tamanho 'n'

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Enter product%d name and price:%n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new i_Product(name, price); // a posição i do vetor vai apontar para esse novo produto
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
