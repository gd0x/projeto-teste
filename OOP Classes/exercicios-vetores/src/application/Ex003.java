package application;

import entities.Alturas_003;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Alturas_003[] vect = new Alturas_003[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Alturas_003(name, age, height);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {// soma das alturas
            sum += vect[i].getHeight();
        }

        int amount = 0;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", sum / n);

        for (int i = 0; i < vect.length; i++) { //para cada idade < 16, amount recebe 1 unidade de valor
            if (vect[i].getAge() < 16) {
                amount ++;
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (double) amount / n * 100);

        for (int i = 0; i < vect.length; i++) { //para cada idade < 16, amount recebe 1 unidade de valor
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();

    }
}
