package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String oldestPerson = " ";
        int oldestAge;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] vectNames = new String[n];
        int[] vectAges = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            vectNames[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectAges[i] = sc.nextInt();
            sc.nextLine();
        }

        oldestAge = vectAges[0];

        for (int i = 0; i < n; i++) {
            if(vectAges[i] > oldestAge){
                oldestAge = vectAges[i];
                oldestPerson = vectNames[i];
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", oldestPerson);

        sc.close();

    }
}
