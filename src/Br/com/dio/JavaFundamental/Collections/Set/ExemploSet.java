package Br.com.dio.JavaFundamental.Collections.Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println( "Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d,0d, 3.6));
        System.out.println(notas.toString());

        //Não é possivel pesquisar posição na lista SET, pois fica aleatório;
        // System.out.println("Exiba a posição da nota 5.0");

        //Impossivel colocar em posição;
        //System.out.println("Adicion na lista a nota 8.0 na posição 4");

        //impossivel substituir algo no SET;
        //System.out.println("Substitua a nota 5.0 pela nota 6.0");

        System.out.println("\nConfira se a nota 5.0 esta no conjunto: "+ notas.contains(5d));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma =0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);
        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println("\nLista LinkedHashset");
        System.out.println(notas2);

        System.out.println("\nExiba todas  as notas da ordem crescente: ");
        System.out.println("Lista Treeset");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\nApague todos os conjuntos");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio:  " + notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio:  " + notas2.isEmpty());
        System.out.println("Confira se o conjunto está vazio:  " + notas3.isEmpty());

    }
}
