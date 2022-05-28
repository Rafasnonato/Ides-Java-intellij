package Br.com.dio.JavaEssencial.PPO.Inteface;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println((operando1+operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println((operando1-operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println((operando1*operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        if (operando2!=0) {
            System.out.println((operando1/operando2));
        }else {
            System.out.println("Impossivel dividir por 0");
        }
    }
}
