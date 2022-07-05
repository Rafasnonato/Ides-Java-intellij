package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.LaçoDeRepetiçao;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota de 0 a 10");
        nota = teclado.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Digite novamente: ");
            nota = teclado.nextDouble();
        }
    }
}
