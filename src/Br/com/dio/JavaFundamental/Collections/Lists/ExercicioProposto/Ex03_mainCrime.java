package Br.com.dio.JavaFundamental.Collections.Lists.ExercicioProposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex03_mainCrime {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        List<Ex03_Pessoa> Pessoas = new ArrayList<>();
        String nome,resposta1,resposta2,resposta3,resposta4,resposta5, situacao = " ";

        while (true){
            int contador = 0;
            System.out.print("Digite o nome: ");
            nome= teclado.next();
            System.out.print("Telefonou para a vitima? ");
            resposta1=teclado.next();
            if (resposta1.equals("s"))contador++;
            System.out.print("Esteve no local do crime? ");
            resposta2=teclado.next();
            if (resposta2.equals("s"))contador++;
            System.out.print("Mora perto da vitima? ");
            resposta3=teclado.next();
            if (resposta3.equals("s"))contador++;
            System.out.print("Devia para a vitima? ");
            resposta4=teclado.next();
            if (resposta4.equals("s"))contador++;
            System.out.print("Já trabalhou com a vitima? ");
            resposta5=teclado.next();
            if (resposta5.equals("s"))contador++;

            switch (contador){
                case 0:
                case 1:
                    situacao = "Inocente";
                    break;
                case 2:
                    situacao = "Suspeito";
                    break;
                case 3:
                case 4:
                    situacao = "Cumplice";
                    break;
                case 5:
                    situacao = "Assassino";
                    break;
            }
            Pessoas.add(new Ex03_Pessoa(nome,situacao));

            System.out.println("Deseja continuar? 1 - SIM ou 2 - NAO");
            int resposta = teclado.nextInt();
            if (resposta != 1 ) break;
        }

        Collections.sort(Pessoas);
        System.out.println("Lista de pessoas");
        System.out.println(Pessoas.toString());
    }
}
