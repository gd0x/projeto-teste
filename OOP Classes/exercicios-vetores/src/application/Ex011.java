package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double tallest, shortest, heightWomen;
        int amountMen, amountWomen;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double[] vectHeight = new double[n];
        String[] vectGender = new String[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            vectHeight[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            vectGender[i] = sc.next();
        }

        tallest = vectHeight[0];
        shortest = vectHeight[0];
        amountWomen = 0;
        amountMen = 0;
        heightWomen = 0.0;

        for (int i = 0; i < n; i++){
            if(vectHeight[i] > tallest){
                tallest = vectHeight[i];
            }

            if(vectHeight[i] < shortest){
                shortest = vectHeight[i];
            }

            char c = vectGender[i].toUpperCase().charAt(0);
            if(c == 'F'){
                amountWomen +=1;
                heightWomen += vectHeight[i];
            }

            if (c == 'M'){
                amountMen +=1;
            }
        }

        System.out.printf("Menor altura = %.2f%n", shortest);
        System.out.printf("Maior altura = %.2f%n", tallest);
        System.out.printf("Média das alturas das mulheres = %.2f%n", heightWomen/amountWomen);
        System.out.printf("Numero de homens = %d", amountMen);

        sc.close();
    }

}
