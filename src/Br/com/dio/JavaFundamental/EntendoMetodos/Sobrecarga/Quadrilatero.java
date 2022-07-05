package Br.com.dio.JavaFundamental.EntendoMetodos.Sobrecarga;

public class Quadrilatero {

    //calcular area do quadrado
    public static void area (double lado) {
        double resultado = lado*lado;
        System.out.println("A area do quadrado eh: " + resultado );
    }

    //calcular area do retangulo
    public static void area (double lado1, double lado2) {
        double resultado = lado1*lado2;
        System.out.println("A area do retangulo eh: " + resultado );
    }

    //calcular area do trapezio
    public static void area (double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior+baseMenor) * altura) / 2 ;
        System.out.println("A area do trapezio eh: " + resultado );
    }

    public static void area (float diagonal1, float diagonal2){
        double resultado = (diagonal1*diagonal2)/2;
        System.out.println("A area do losango eh: " + resultado);
    }


}
