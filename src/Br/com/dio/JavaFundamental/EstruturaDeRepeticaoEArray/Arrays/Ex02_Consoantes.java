package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.Arrays;

import java.util.Scanner;

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] consoantes = new String[6];
        int qntConsoantes = 0, contador = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = teclado.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[contador]= letra;
                qntConsoantes++;
            }
            contador++;

        } while (contador<consoantes.length);

        System.out.println( "Consoantes: ");
        //Tipo de elemento, variavel (nova) : array(vetor)
        for ( String consoante : consoantes ) {
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nQuantidade de consoante(s)" + qntConsoantes );

    }
}
