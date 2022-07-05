package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.Arrays;

import java.util.Random;

public class Ex03_Numeros {
    public static void main(String[] args) {
        // fazer lista aleatórias.
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i<numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }


        System.out.print("\nAntecessor dos Números aleatórios: ");
        for ( int numero  :  numAleatorios) {
            System.out.print((numero-1) + ", ");
        }

        System.out.print("\nNúmeros aleatórios: ");
        for ( int numero  :  numAleatorios) {
            System.out.print(numero+ ", ");
        }

        System.out.print("\nSucessor dos Números aleatórios: ");
        for ( int numero  :  numAleatorios) {
            System.out.print((numero+1) + ", ");
        }

    }
}
