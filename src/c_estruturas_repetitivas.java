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

        //EXERCICIOS while
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

        //EXERCICIOS for
        /*
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1; i<=num ; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
        */

        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // quantidade de valores inteiros que devem ser lidos
        int in = 0;
        int out = 0;

        for (int i = 0; i<N ;i++){ // i começa com 0 e se aproxima de N em uma unidade a cada repetição/valor digitado. Assim que i=N, os cálculos param
            int values = sc.nextInt();
            if (values >=10 && values <= 20){ // checa cada numero em relação ao intervalo [10;20]
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in%n%d out", in, out);
        */

        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // numero de casos de teste que vem a seguir.
        for (int i = 0; i<N; i++){

            float value1 = sc.nextFloat();
            float value2 = sc.nextFloat();
            float value3 = sc.nextFloat();

            float mediaPonderada = (value1*2 + value2*3 + value3*5)/10;
            System.out.printf("%.1f%n", mediaPonderada);
        */

        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i<N; i++){

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num2 != 0){
                double divisao = (double) num1/num2;
                System.out.println(divisao);
            } else {
                System.out.println("divisao impossivel");
            }

        }

        sc.close();
        */

        //único que não consegui até agora, pelo menos entendi a solução assim que bati o olho nela
        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int fatorial = 1;

        for (int i=1; i<=N; i++){
            fatorial = fatorial * i;

        }

        System.out.println(fatorial);

        sc.close();
        */

        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            if (N%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
        */

        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i<=N ;i++){

            System.out.println(i + " " + i*i + " " + i*i*i);

        }
        sc.close();
        */
    }

}


