package Br.com.dio.JavaFundamental.Collections.Set;

import java.util.*;

public class ordenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("that 70s show", "Comedia", 25));
        }};

        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That 70s show", "Comedia", 25));
        }};

        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Genero/Tempo\t--");
        Set<Serie> minhasSeries3= new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        minhasSeries3.add(new Serie("Got","Terror",45));

        for ( Serie serie: minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Genero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries3);
        minhasSeries4.add(new Serie("The blacklist", "Ação" , 42));

        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("--\tOrdem Tempo episódio\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempo());
        minhasSeries5.addAll(minhasSeries4);
        minhasSeries5.add(new Serie("Truques da mente","Documentario", 25));
        minhasSeries5.add(new Serie("Suits","Drama", 42));

        for ( Serie serie: minhasSeries5 ) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }





    }
}

