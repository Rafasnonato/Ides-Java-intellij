package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.LaçoDeRepetiçao;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qntNumeros, numero, contadorPar = 0 , contadorImpar = 0, contador = 0;

        System.out.println("Digite a quantidade de numeros");
        qntNumeros=teclado.nextInt();

        do {
            System.out.println("Digite um numero inteiro");
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                contadorPar++;
            } else {
                contadorImpar++;
            }
            contador ++;
        }while (contador < qntNumeros);

        System.out.println("Quantidade(s) de numero(s) par(es): " + contadorPar);
        System.out.println("Quantidade(s) de numero(s) impar(es): " + contadorImpar);

    }
}
