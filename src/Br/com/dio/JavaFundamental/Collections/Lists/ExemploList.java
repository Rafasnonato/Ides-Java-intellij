package Br.com.dio.JavaFundamental.Collections.Lists;
//importantando a lista.
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista  e adicione as sete notas: ");
        //List, Objeto (Double, Interger, ou PPO), nome da lista = instanciar lista.
        List<Double> notas = new ArrayList<Double>();
        //nome da lista. Função desejada.(posição + elemento)Ou(somente elemento)
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);
        // System.out.println(notas.toString()); ou pode ser desse jeito;

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5.0));
        System.out.println("Confira se a nota 6.0 está na lista: " + notas.contains(6.0));

        /*for ( double nota :notas) {
            System.out.println(nota);
        }*/

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));

        //Para verificar menor ou maior nota precisamos chamar a classe collections.min ou max;
        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //metodo Iterator para calcular as notas.
        Iterator<Double> iterator = notas.iterator();
        //variavel de somar as notas;
        Double soma= 0d;
        //Laço de repetição . nome da variavel Iterator.hasNext(se tiver proximo)
        while (iterator.hasNext()){
            //Variavel para soma o próximo.
            Double next = iterator.next();
            soma+= next;
        }

        System.out.println("\nExiba a soma dos valores: " + soma);
        System.out.println("Exiba a media das notas :" + (soma/notas.size()));

        System.out.println("\nRemover a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remover a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista");
        notas.clear(); // apagar toda lista
        System.out.println(notas);

        //notas.isEmpty devolve se a lista está vazia (true ou false)
        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

    }
}
