package Br.com.dio.JavaFundamental.Collections.Set.ExercicioProposto.Exercicio02;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem linguagem1, Linguagem linguagem2) {
        int IDE = linguagem1.getIde().compareTo(linguagem2.getIde());
        if(IDE!=0) return IDE;

        return linguagem1.getNome().compareTo(linguagem2.getNome());
    }
}
