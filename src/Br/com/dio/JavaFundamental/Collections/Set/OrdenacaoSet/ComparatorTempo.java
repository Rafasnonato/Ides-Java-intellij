package Br.com.dio.JavaFundamental.Collections.Set.OrdenacaoSet;

import java.util.Comparator;

public class ComparatorTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEp = Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
        if (tempoEp != 0) return tempoEp;

        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        return genero;
    }
}
