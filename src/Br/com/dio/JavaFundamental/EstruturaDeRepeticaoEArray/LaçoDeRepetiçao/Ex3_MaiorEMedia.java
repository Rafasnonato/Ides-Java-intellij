package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.LaçoDeRepetiçao;
import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero,maior = 0, contador=0, acumuladorDeNumero =0;

        do {
            System.out.println("Numero:");
            numero = teclado.nextInt();
            acumuladorDeNumero+=numero;
            if(numero>maior){
                maior = numero;
            }
            contador++;

        }while ( contador < 5);

        double media = (acumuladorDeNumero/5);
        System.out.println(" O Maior numero é: " + maior);
        System.out.println(" A media dos numero é: " + media );
    }
}
