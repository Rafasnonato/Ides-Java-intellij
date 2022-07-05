package Br.com.dio.JavaFundamental.Collections.Set.ExercicioProposto.Exercicio02;

import java.util.Comparator;

public class ComparatorAnoENome implements Comparator<Linguagem> {


    @Override
    public int compare(Linguagem linguagem1, Linguagem linguagem2) {
        int ano = linguagem1.getAno().compareTo(linguagem2.getAno());
        if(ano!=0) return ano;

        int nome = linguagem1.getNome().compareTo(linguagem2.getNome());
        if(nome!=0) return nome;

        return linguagem1.getIde().compareTo(linguagem2.getIde());
    }
}
