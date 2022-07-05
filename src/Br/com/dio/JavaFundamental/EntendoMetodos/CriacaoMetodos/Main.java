package Br.com.dio.JavaFundamental.EntendoMetodos.CriacaoMetodos;

public class Main {

    public static void main(String[] args) {
        //chama a classe calculadora e apresenta os resultados.
        System.out.println("Exercicio calculador");
        //classe depois o metodo desejado.
        calculadora.soma(3,5);
        calculadora.subtracao(5,3);
        calculadora.multiplicacao(6,7);
        calculadora.divisao(5,0);
        calculadora.divisao(5,3);

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(4);
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);

        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }
}
