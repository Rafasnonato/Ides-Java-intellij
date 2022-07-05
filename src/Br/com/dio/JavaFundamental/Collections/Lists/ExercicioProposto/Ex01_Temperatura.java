package Br.com.dio.JavaFundamental.Collections.Lists.ExercicioProposto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01_Temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Double> Temperaturas = new ArrayList<>();

        for (int i= 1; i<=6; i++){
            System.out.print("Digite a temperatura do mês " + i + ": ");
            double temperatura = teclado.nextDouble();
            Temperaturas.add(temperatura);
        }

        System.out.print("\nTodas as temperaturas: " + Temperaturas);

        Iterator<Double> iterator = Temperaturas.iterator();
        Double soma= 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        Double media = soma/ Temperaturas.size();

        System.out.printf("\n\nA temperatura media dos 6 primeiros meses do ano é: %.2f",media);

        Iterator<Double> iterator2 = Temperaturas.iterator();
        int contador = 0;

        System.out.println("\nO(s) mês(es) com a temperatura maior que a média é(são): ");
        while (iterator2.hasNext()){
            Double temperatura = iterator2.next();
            if (temperatura>media){
                switch (contador){
                    case (0):
                        System.out.println( "1 - janeiro: " + temperatura + "°C" );
                        break;
                    case (1):
                        System.out.println( "2 - Fevereiro: " + temperatura + "°C" );
                        break;
                    case (2):
                        System.out.println( "3 - Março: " + temperatura + "°C" );
                        break;
                    case (3):
                        System.out.println( "4 - Abril: " + temperatura + "°C" );
                        break;
                    case (4):
                        System.out.println( "5 - Maio: " + temperatura + "°C" );
                        break;
                    case (5):
                        System.out.println( "6 - Junho: " + temperatura + "°C" );
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            contador++;

        }
    }
}
