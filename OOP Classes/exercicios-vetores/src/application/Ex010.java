package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        double sum = 0.0;

        String[] vectName = new String[n];
        double[] vectGradeOne = new double[n];
        double[] vectGradeTwo = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i);
            sc.nextLine();
            vectName[i] = sc.nextLine();
            vectGradeOne[i] = sc.nextDouble();
            vectGradeTwo[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            if ((vectGradeOne[i] + vectGradeTwo[i]) / 2 >= 6.0) {
                System.out.println(vectName[i]);
            }
        }

        sc.close();

    }

}
