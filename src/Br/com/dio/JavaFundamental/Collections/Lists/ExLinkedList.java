package Br.com.dio.JavaFundamental.Collections.Lists;


import java.util.LinkedList;

public class ExLinkedList {
    public static void main(String[] args) {
        LinkedList notas2 = new LinkedList();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println("As notas são: " + notas2);

        System.out.println("\nA primeira nota da lista é: " + notas2.get(0));

        System.out.println("\nA primeira nota é: " + notas2.remove(0) + " E ela foi removida.");

        System.out.println("\nAs notas agora são: " + notas2);


    }
}
