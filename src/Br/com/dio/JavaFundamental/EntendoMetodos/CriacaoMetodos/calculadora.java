package Br.com.dio.JavaFundamental.EntendoMetodos.CriacaoMetodos;

public class calculadora {


    public static void soma (double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println(" A soma de " +numero1 + " mais " + numero2 + " e " + resultado);
    }
    public static void subtracao (double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println(" A subtracao de " +numero1 + " menos " + numero2 + " e " + resultado);
    }
    public static void multiplicacao (double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println(" A multiplicacao de " +numero1 + " vezes " + numero2 + " e " + resultado);
    }
    public static void divisao (double numero1, double numero2) {
        if (numero2==0){
            System.out.println("Impossivel dividir por 0");
        }else {
            double resultado = numero1 / numero2;
            System.out.println(" A divisao de " +numero1 + " por " + numero2 + " e " + resultado);
        }

    }


}
