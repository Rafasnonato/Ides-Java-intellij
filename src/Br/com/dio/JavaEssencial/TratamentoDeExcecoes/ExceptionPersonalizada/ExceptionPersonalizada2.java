package Br.com.dio.JavaEssencial.TratamentoDeExcecoes.ExceptionPersonalizada;

import javax.swing.*;

public class ExceptionPersonalizada2 {

    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Impossivel dividir por 0!");
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Array do denominador maior que o array do numerador.");
            }
        }
        System.out.println("O programa continua...");
    }
}
