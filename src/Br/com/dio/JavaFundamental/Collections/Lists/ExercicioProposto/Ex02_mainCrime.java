package Br.com.dio.JavaFundamental.Collections.Lists.ExercicioProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_mainCrime {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Ex02_Pessoa> Inocente = new ArrayList<>();
        List<Ex02_Pessoa> Suspeita = new ArrayList<>();
        List<Ex02_Pessoa> Cumplice = new ArrayList<>();
        List<Ex02_Pessoa> Assassina = new ArrayList<>();


        String nome,resposta1,resposta2,resposta3,resposta4,resposta5;


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

            if (contador<2){
                Inocente.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
            }else if (contador ==2){
                Suspeita.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
            }else if (contador>2 && contador<5){
                Cumplice.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
            }else {
                Assassina.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
            }

            /*switch (contador){
                case 0:
                case 1:
                    Inocente.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
                    break;
                case 2:
                    Suspeita.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
                    break;
                case 3:
                case 4:
                    Cumplice.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
                    break;
                case 5:
                    Assassina.add(new Ex02_Pessoa(nome,resposta1,resposta2,resposta3,resposta4,resposta5));
                    break;
            }*/

            System.out.println("Deseja continuar? 1 SIM ou 2 NAO");
            int resposta = teclado.nextInt();
            if (resposta != 1) break;
        }

        System.out.println("Lista dos(as) Inocentes:");
        System.out.println(Inocente.toString());
        System.out.println("Lista dos(as) Suspeitos(as):");
        System.out.println(Suspeita.toString());
        System.out.println("Lista dos(as) Cumplices:");
        System.out.println(Cumplice);
        System.out.println("Lista dos(as) Assasinos(as):");
        System.out.println(Assassina);

    }
}
