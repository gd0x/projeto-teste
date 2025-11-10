package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.println();
        System.out.printf("AREA = %.2f", x.area());

        System.out.println();
        System.out.printf("PERIMETER = %.2f", x.perimeter());

        System.out.println();
        System.out.printf("DIAGONAL = %.2f", x.diagonal());

        sc.close();

    }

}
