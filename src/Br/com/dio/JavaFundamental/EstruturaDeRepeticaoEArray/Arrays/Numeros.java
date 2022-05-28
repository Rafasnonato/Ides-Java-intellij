package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.Arrays;

import java.util.Random;

public class Numeros {
    public static void main(String[] args) {
        // numeros aleatorios
        Random random = new Random();

        int[] numAletorios = new int[20];

        for (int i = 0; i<numAletorios.length; i++){
            int numero = random.nextInt(100);
            numAletorios[i] = numero;
        }

        System.out.print("\nAncessor dos Números aleatórios: ");
        for ( int numero  :  numAletorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nNúmeros aleatórios: ");
        for ( int numero  :  numAletorios) {
            System.out.print(numero+ " ");
        }

        System.out.print("\nSucessores dos Números aleatórios: ");
        for ( int numero  :  numAletorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
