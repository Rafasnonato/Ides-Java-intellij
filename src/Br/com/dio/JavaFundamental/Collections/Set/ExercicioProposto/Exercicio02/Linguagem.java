package Br.com.dio.JavaFundamental.Collections.Set.ExercicioProposto.Exercicio02;

import java.util.Objects;

public class Linguagem implements Comparable<Linguagem>{
    private String nome, ide;
    private Integer ano;

    public Linguagem(String nome, String ide, Integer ano) {
        this.nome = nome;
        this.ide = ide;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getIde() {
        return ide;
    }

    public Integer getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Linguagem: " + "nome: " + nome + ", ide: " + ide+ ", ano: " + ano + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return nome.equals(linguagem.nome) && ide.equals(linguagem.ide) && ano.equals(linguagem.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ide, ano);
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        int nome = this.getNome().compareTo(linguagem.getNome());
        if (nome!=0) return nome;

        int ano = this.getAno().compareTo(linguagem.getAno());
        if (ano!=0) return ano;

        return this.getIde().compareTo(linguagem.getIde());
    }
}
