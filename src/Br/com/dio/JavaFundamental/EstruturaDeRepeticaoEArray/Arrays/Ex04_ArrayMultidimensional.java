package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex04_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado=new Scanner(System.in);

        int [][] M = new int[4][4];
        int [][] M2= new int[3][3];

        for (int i = 0; i< M.length; i++){
            for (int j = 0; j< M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha) {
                System.out.print(coluna + " | " );
            }
            System.out.println();
        }

        for (int i =0; i<M2.length;i++){
            for (int j = 0; j<M2[i].length;j++){
                System.out.println("Digite um numero: ");
                int numeroDigitado= teclado.nextInt();
                M2[i][j] = numeroDigitado;
            }
        }

        System.out.println("Matriz digitada");
        for (int[] linhaM2 : M2){
            for (int colunaM2 : linhaM2){
                System.out.print(colunaM2 + " | ");
            }
            System.out.println();
        }
    }
}
