package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.LaçoDeRepetiçao;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fatorial, fatorial1, resultado = 1, resultadoWhile = 1;
        int fatorial2, resultadoDo = 1;

        System.out.println( "Digite um numero: ");
        fatorial=teclado.nextInt();

        for (int i = fatorial ;i >=1 ; i-- ){
            resultado*=i;
        }

        System.out.println("O fatorial de " + fatorial + " é = " + resultado);

        System.out.println("Fatorial com while");

        System.out.println( "Digite um numero: ");
        fatorial1=teclado.nextInt();
        int contador = fatorial1;

        while (contador>=1){
            resultadoWhile*=contador;
            contador--;
        }

        System.out.println("O fatorial de " + fatorial1 + " é = " + resultadoWhile);

        System.out.println("Fatorial com Do while");

        System.out.println( "Digite um numero: ");
        fatorial2=teclado.nextInt();
        int contadorDo = fatorial2;
        do {
            resultadoDo *= contadorDo;
            contadorDo--;
        } while (contadorDo >=1);

        System.out.println("O fatorial de " + fatorial2 + " é = " + resultadoDo);


    }
}
