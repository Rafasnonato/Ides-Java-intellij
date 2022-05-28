package Br.com.dio.JavaEssencial.PPO.Inteface;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        calculadora.soma(5d,4.5);
        calculadora.subtracao(5d,4.5);
        calculadora.multiplicacao(5d,4.5);
        calculadora.divisao(5d,4.5);
        calculadora.divisao(5d,0d);
    }
}
