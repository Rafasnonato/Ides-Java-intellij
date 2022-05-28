package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.LaçoDeRepetiçao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada, contador = 1, contadorDo = 1;

        System.out.println("Digite o numero que deseja ver da tabuada");
        tabuada = teclado.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i) );
        }

        System.out.println("Tabuada com while");

        while (contador<=10){
            System.out.println(tabuada + "x" + contador + "=" + (tabuada*contador));
            contador++;
        }
        System.out.println("Tabuada com do while");

        do {
            System.out.println(tabuada + "x" + contadorDo + "=" + (tabuada*contadorDo));
            contadorDo++;
        }while (contadorDo<=10);

    }
}
