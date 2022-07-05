package Br.com.dio.JavaFundamental.Collections.Set.ExercicioProposto;

import java.util.*;

public class Ex01_ArcoIris {
    public static void main(String[] args) {

        Set<String> ArcoIris = new HashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        System.out.println("Todas as cores em ordem aleátoria:");
        for (String cores : ArcoIris){
            System.out.println(cores);
        }


        System.out.println("\nQuantidade de cores do arco-íris: " + ArcoIris.size());


        System.out.println("\nCores por ordem alfabética");
        Set<String> ArcoIris2 = new TreeSet<>(ArcoIris);
        System.out.println(ArcoIris2);
        /*for (String cores1 : ArcoIris2){
            System.out.println(cores1);
        }*/

        System.out.println("\nOrdem adicionada");
        List<String>ArcoIris1 = new ArrayList<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};
        System.out.println(ArcoIris1);
        Collections.reverse(ArcoIris1);
        System.out.println("Ordem inversa da que foi informada");
        System.out.println(ArcoIris1);

        System.out.println("\nCores que começam com a letra 'V': ");

        for (String cor : ArcoIris1){
            if(cor.startsWith("V")){
                System.out.print(cor + ", ");
            }
        }


        System.out.println("\nRemovendo cores que não começa com V");
        ArcoIris1.removeIf(cor -> !cor.startsWith("V"));
        System.out.println(ArcoIris1);

        /*Iterator<String> iterator2 = ArcoIris1.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) {
                iterator2.remove();
            }
        }
        System.out.println(ArcoIris1);*/

        System.out.println("\nLimpando a lista: ");
        ArcoIris1.clear();
        System.out.println("A Lista está vazia: " +ArcoIris.isEmpty());
        System.out.println("A Lista está vazia: " +ArcoIris1.isEmpty());
        System.out.println("A Lista está vazia: " +ArcoIris2.isEmpty());
    }
}
