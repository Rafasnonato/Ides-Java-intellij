package Br.com.dio.JavaFundamental.Collections.Lists.ExercicioProposto;


public class Ex03_Pessoa implements Comparable<Ex03_Pessoa>{
    private String nome, situacao;

    public Ex03_Pessoa(String nome, String situacao) {
        this.nome = nome;
        this.situacao = situacao;
    }

    public String getNome() {return nome;}

    public String getSituacao() {return situacao;}

    @Override
    public String toString() {
        return "\nNome: " + nome + "- situacao: " + situacao + ".";
    }


    @Override
    public int compareTo(Ex03_Pessoa Pessoa) {
        return this.getSituacao().compareToIgnoreCase(Pessoa.getSituacao());
    }

}
