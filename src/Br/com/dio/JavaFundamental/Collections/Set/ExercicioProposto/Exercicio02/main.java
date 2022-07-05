package Br.com.dio.JavaFundamental.Collections.Set.ExercicioProposto.Exercicio02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Linguagem> LinguagemFavorita = new LinkedHashSet<>(){{
            add(new Linguagem("Python","Pycharm" , 1991));
            add(new Linguagem("Java" ,"Intellij",1995));
            add(new Linguagem("JavaScript" ,"Visual Studio code",1991));
        }};
        System.out.println("Ordem de inserção");
        for (Linguagem linguagem : LinguagemFavorita){
            System.out.println(linguagem.getNome() + " - " + linguagem.getIde()+ " - "+ linguagem.getAno());
        }

        System.out.println("\nOrdem de Natural (nome)");
        Set<Linguagem> LinguagemFavorita1 = new TreeSet<>(LinguagemFavorita);
        LinguagemFavorita1.add(new Linguagem("Java" ,"Visual Studio code",1995));
        for (Linguagem linguagem : LinguagemFavorita1){
            System.out.println(linguagem.getNome() + " - " + linguagem.getAno() + " - "+linguagem.getIde());
        }

        System.out.println("\nOrdem pela IDE: ");
        Set <Linguagem> LinguagemFavorita2 = new TreeSet<>(new ComparatorIDE());
        LinguagemFavorita2.addAll(LinguagemFavorita1);
        for (Linguagem linguagem : LinguagemFavorita2){
            System.out.println(linguagem.getIde() + " - " + linguagem.getNome() + " - "+ linguagem.getAno());
        }

        System.out.println("\nOrdem pelo Ano e Nome: ");
        Set <Linguagem> LinguagemFavorita3 = new TreeSet<>(new ComparatorAnoENome());
        LinguagemFavorita3.addAll(LinguagemFavorita1);
        for (Linguagem linguagem : LinguagemFavorita3){
            System.out.println(linguagem.getAno() + " - " + linguagem.getNome() + " - "+ linguagem.getIde());
        }

    }
}
