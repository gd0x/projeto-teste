import java.util.Scanner;

public class c_estruturas_repetitivas {

    public static void main (String[] args){

        //aprendendo while + aprendendo a debugar na prática
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0 ){
            soma += x;
            x = sc.nextInt();

        }
        System.out.printf("SOMA: %d", soma);

        sc.close();
        */

        //EXERCICIOS
        /*
        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }

        System.out.println("Acesso Permitido");
        */

        /*
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if(x < 0){
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();

        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(combustivel != 4){
            if(combustivel == 1){
                alcool += 1;
            } else if (combustivel == 2) {
                gasolina += 1;
            } else if (combustivel == 3) {
                diesel += 1;
            }
            combustivel = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
        */

        
    }

}
