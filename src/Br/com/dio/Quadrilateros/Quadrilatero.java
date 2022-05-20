package Br.com.dio.Quadrilateros;

public class Quadrilatero {

    public static void area (double lado) {
        double resultado = lado*lado;
        System.out.println("A area do quadrado eh: " + resultado );
    }
    public static void area (double lado1, double lado2) {
        double resultado = lado1*lado2;
        System.out.println("A area do retangulo eh: " + resultado );
    }
    public static void area (double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior+baseMenor) * altura) / 2 ;
        System.out.println("A area do retangulo eh: " + resultado );
    }


}
