package Br.com.dio.JavaFundamental.Collections.Lists.OrdenacaoDeElemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaçãoDeElementos {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("jon",12,"amarelo"));

        }};

        System.out.println("\n--\tOrdem de inserção\t--");
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem aleatória\t--");
        //Class collection para bagunçar a ordem dos gatos
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem natural (Nome)\t--");
        //Class collection ordem por nome dos gatos, foi instanciado na class gato
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem idade\t--");
        Collections.sort(meusGatos,new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem cor\t--");
        Collections.sort(meusGatos, new ComparatorCor());
        //meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        //meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

