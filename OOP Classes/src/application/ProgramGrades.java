package application;

import entities.Grades;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGrades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Grades grade = new Grades();
        String name = sc.nextLine();

        grade.num1 = sc.nextDouble();
        grade.num2 = sc.nextDouble();
        grade.num3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", grade.gradeSum());

        if (grade.gradeSum() >= 60) {
            System.out.print("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", grade.missingPoints());
        }

        sc.close();

    }

}
