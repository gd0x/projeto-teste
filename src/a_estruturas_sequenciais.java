public class a_estruturas_sequenciais {

    public static void main(String[] args) {
        //(System.out.print, Concatenação, Quebra de linha, Tipos de Variáveis e Locale)
        /*

        System.out.println("Hello World!");

        double x = 10.987654321;
        double distance = 33.31415;

        System.out.println("x: " + x);
        System.out.printf("%.2f%n", x); // 2 casas decimais + quebra de linha %n + arredondamento?
        System.out.printf("%.4f%n", x); // 4 casas decimais +          ~         +        ~

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("A distância é de " + distance + " metros.");
        System.out.printf("A distância é de %.2f metros%n", distance); // outra maneira de concatenar

        String nome = "Maria";
        int idade = 30;
        double renda = 1412.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
        */

        //Minha Solução do primeiro exercicio do curso:
        /*
        // Define o Locale padrão para Português do Brasil pq o do meu pc já está no dos EUA
        Locale.setDefault(new Locale("pt", "BR"));

        String product1 = "Computer";
        String product2 = "Office desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: %n%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        //Define o Locale padrão de volta para US
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        */

        //Processamento de Dados / Casting
        /*
        double a;
        int b;

        a = 5.0;
        b = (int) a;

        System.out.println(b);
        */

        //Entrada de Dados
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Parte 1
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println("String: " + x);
        System.out.println("Inteiro: " + y);
        System.out.println("Double: " + z);

        //Parte 2
        int w;
        String s1, s2, s3;

        w = sc.nextInt();
        sc.nextLine(); // nao entendi 100% o pq disso ser necessario. vou revisar hj mais tarde
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(w);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

        */

        //Funções Matemáticas
        /*
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " ao quadrado = " + B);
        System.out.println("5 ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Módulo de " + y + " = " + A);
        System.out.println("Módulo de " + z + " = " + B);
        // java.lang.math para mais funções
        */

        //EXERCICIOS
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("SOMA = %d", num1 + num2);


        sc.close();

        Scanner sc = new Scanner(System.in);
        double raio;
        double pi = 3.14159;

        raio = sc.nextDouble();
        double area = pi*Math.pow(raio, 2.0);

        System.out.printf("A=%.4f", area);

        sc.close();


        int A, B, C, D;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int DIFERENCA = A*B - C*D;

        System.out.printf("DIFERENCA = %d", DIFERENCA);

        sc.close();


        Scanner sc = new Scanner(System.in);

        int number, hours;
        double payment;

        number = sc.nextInt(); //numero do funcionario
        hours = sc.nextInt(); // total de horas trabalhadas
        payment = sc.nextDouble(); // pagamento recebido ao se trabalhar por 1 hora

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f", hours*payment);

        sc.close();


        Scanner sc = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double val1, val2;

        cod1 = sc.nextInt(); // codigo peça 1
        num1 = sc.nextInt(); // quantidade
        val1 = sc.nextDouble(); // valor de cada peça

        cod2 = sc.nextInt(); // codigo peça 2
        num2 = sc.nextInt();
        val2 = sc.nextDouble();

        double total = num1*val1 + num2*val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);


        sc.close();


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // area de cada figura
        double triangulo = A*C/2;
        double circulo = pi * Math.pow(C, 2.0);
        double trapezio = (A + B) * C / 2;
        double quadrado = Math.pow(B, 2.0);
        double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();

        */
        //FIM DOS EXERCICIOS
    }
}