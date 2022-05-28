package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.Arrays;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = {2, 7, 6, 5, 9, 3};
        int contador = 0;
        System.out.print("Vetor: ");
        while (contador < vetor.length) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor na posição inversa: ");
        for (int i= (vetor.length-1); i >=0 ; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
