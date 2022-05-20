package Br.com.dio.Retorno;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado = retornoQuadilatero.area(3);
        System.out.println(" A area do quadrado e: " + areaQuadrado);

        double areaRetangulo =retornoQuadilatero.area(5,5);
        System.out.println(" A area do retangulo e: " + areaRetangulo);

        double areaTrapezio = retornoQuadilatero.area(7,8,9);
        System.out.println(" A area do trapezio e: " + areaTrapezio);


    }

}
