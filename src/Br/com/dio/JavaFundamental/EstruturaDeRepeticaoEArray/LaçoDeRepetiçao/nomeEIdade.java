package Br.com.dio.JavaFundamental.EstruturaDeRepeticaoEArray.LaçoDeRepetiçao;
import java.util.Scanner;

public class nomeEIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.println("Digite seu nome");
            nome = teclado.next();
            if (nome.equals("0")) break;
            System.out.println("Agora digite sua idade");
            idade = teclado.nextInt();
        }

    }
}
