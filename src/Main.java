import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //EXERCICIOS

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0){
            System.out.print("NAO NEGATIVO");

        }
        else {
            System.out.print("NEGATIVO");
        }


        sc.close();
        */

        /*
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x%2 == 0){
            System.out.print("PAR");
        }
        else {
            System.out.print("IMPAR");
        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 || y == 0){
            if (x == 0 && y == 0){
                System.out.print("Sao Multiplos");
            }
            else {
                System.out.print("Nao Sao Multiplos");
            }
        }

        else if (x%y == 0 || y%x == 0) {
                System.out.print("Sao Multiplos");
        }
        else {
                System.out.print("Nao Sao Multiplos");
        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(); // horario do inicio do jogo
        int h2 = sc.nextInt(); // horario do fim do jogo

        if (h1 > h2) {
            System.out.printf("O JOGO DUROU %d HORA(S)", (24-h1+h2));
        }
        else if (h1 == h2) {
            System.out.print("O JOGO DUROU 24 HORA(S)");
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)", h2-h1);
        }

        sc.close();
        */

        /*
        Scanner sc = new Scanner(System.in);

        float codigo = sc.nextFloat();
        float quantidade = sc.nextFloat();

        if (codigo == 1) {
            System.out.printf("Total: R$ %.2f", quantidade * 4);
        }
        else if (codigo == 2) {
            System.out.printf("Total: R$ %.2f", quantidade * 4.50);
        }
        else if (codigo == 3) {
            System.out.printf("Total: R$ %.2f", quantidade * 5);
        }
        else if (codigo == 4) {
            System.out.printf("Total: R$ %.2f", quantidade * 2);
        }
        else {
            System.out.printf("Total: R$ %.2f", quantidade * 1.5);
        }
        */

        /*
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if (num >= 0 && num <= 25){
            System.out.print("Intervalo [0,25]");
        }
        else if (num > 25 && num <= 50) {
            System.out.print("Intervalo (25,50]");
        }
        else if (num > 50 && num <= 75){
            System.out.print("Intervalo (50,75]");
        }
        else if (num > 75 && num <= 100){
            System.out.print("Intervalo (75,100]");
        }
        else {
            System.out.print("Fora de intervalo");
        }
        */

        /*
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.print("Origem");
        } else if (x > 0 && y > 0) {
            System.out.print("Q1");

        } else if (x < 0 && y > 0) {
            System.out.print("Q2");
        } else if (x < 0 && y < 0) {
            System.out.print("Q3");
        } else if (x > 0 && y < 0) {
            System.out.print("Q4");
        } else {
            System.out.print("Eixo das abcissas ou eixo das ordenadas");
        }
        */

        

    }

}