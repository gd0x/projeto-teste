package application;

//Aula de Boxing, Unboxing, Wrapper classes e laço for each

public class j_Boxing {

    public static void main(String[] args) {

        //BOXING
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        //UNBOXING
        int y = (int) obj;

        System.out.println(y);

        //WRAPPER CLASSES
        Integer example = x;
        int w = example * 2; // Casting nao e necessario
        System.out.println(w);

        //laço for each: sintaxe opcional e simplificada para percorrer coleções
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("----------------");
        for(String lalala : vect){ // (para cada objeto lalala contido no vetor vect, faça)
            System.out.println(lalala);
        }

    }

}
