package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int size = sc.nextInt();
        int amountEven = 0;
        int[] vect = new int[size];
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                amountEven += 1;
            }
        }

        if (amountEven == 0) {
            System.out.print("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", (double) sum / amountEven);
        }

        sc.close();

    }

}
