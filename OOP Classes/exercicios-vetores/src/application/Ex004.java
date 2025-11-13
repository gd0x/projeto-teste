package application;

import entities.NumerosPares_004;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        NumerosPares_004[] vect = new NumerosPares_004[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            int numbers = sc.nextInt();
            vect[i] = new NumerosPares_004(numbers);
        }

        System.out.println();
        System.out.print("NUMEROS PARES: ");
        int amount = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumbers() % 2 == 0) {
                System.out.printf("%d  ", vect[i].getNumbers());
                amount += 1;
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", amount);

        sc.close();

    }

}
