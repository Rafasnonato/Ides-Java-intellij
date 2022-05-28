package Br.com.dio.JavaFundamental.Collections.Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        Map<String,Double> carrosPopulares =new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 Km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("Tucson"));
        System.out.println("Confira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("Uno"));

        System.out.println("Exiba o consumo do Uno: "+ carrosPopulares.get("Uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: "); impossivel fazer isso no HashMap;

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mas econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries ) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double menosEconomico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEconomico = "";

        for (Map.Entry<String,Double> entry : entries1) {
            if (entry.getValue().equals(menosEconomico)){
                modeloMenosEconomico = entry.getKey();
                System.out.println("Modelo menos economico: " + modeloMenosEconomico + " - " + menosEconomico);
            }
        }

        System.out.println("Exiba a soma dos consumos : "  );
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("Exiba a soma dos consumos : " + soma  );

        System.out.println("Exiba a media  dos consumos deste dicionario de carro: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6Km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em quem foram informados: ");
        Map<String,Double> carrosPopulares1 =new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String , Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares.isEmpty());
        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares2.isEmpty());




    }
}
