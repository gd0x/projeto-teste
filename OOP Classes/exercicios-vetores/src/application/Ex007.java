package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", (double) sum / n);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < (double) sum / n) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}
