package Br.com.dio.JavaFundamental.Collections.Lists.ExercicioProposto;

public class Ex02_Pessoa {
    private String nome,resposta1,resposta2,resposta3,resposta4,resposta5;

    public Ex02_Pessoa(String nome, String resposta1, String resposta2, String resposta3, String resposta4, String resposta5) {
        this.nome = nome;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.resposta5 = resposta5;
    }

    public String getNome() {return nome;}

    public String getResposta1() {return resposta1;}

    public String getResposta2() {return resposta2;}

    public String getResposta3() {return resposta3;}

    public String getResposta4() {return resposta4;}

    public String getResposta5() {return resposta5;}

    @Override
    public String toString() {
        return "\nnome: " + nome + ", resposta 01= " + resposta1 + ", resposta 02= " + resposta2 +
                ", resposta 03= " + resposta3 + ", resposta 04= " + resposta4 + ", resposta 05= " + resposta5;
    }


}
