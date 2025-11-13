package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double greatest;
        int n, posGreatest;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            double numbers = sc.nextDouble();
            vect[i] = numbers;
        }

        greatest = vect[0];
        posGreatest = 0;

        for (int i = 0; i < vect.length - 1; i++) {
            if (vect[i] > greatest) {
                greatest = vect[i];
                posGreatest = i;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", greatest);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posGreatest);
        sc.close();

    }

}
