package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee info = new Employee();

        System.out.print("Name: ");
        info.name = sc.nextLine();

        System.out.print("Gross salary: ");
        info.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        info.tax = sc.nextDouble();
        System.out.println();

        System.out.printf("Employee: %s, %.2f", info.name, info.netSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        info.increaseSalary(percentage);

        System.out.println("Updated data: " + info);

        sc.close();

    }

}
