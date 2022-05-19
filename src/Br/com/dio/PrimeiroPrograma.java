package Br.com.dio;

import Br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        System.out.println("Hello World");
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

     /*   int a = 5 , b = 3;
                  System.out.println("Hello world! " + (a+b));*/

    }

}

class Livro{
    private String nome;
    private Integer numPagninas;

    public Livro(String nome, Integer numPagninas) {
        this.nome = nome;
        this.numPagninas = numPagninas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagninas() {
        return numPagninas;
    }

    public void setNumPagninas(Integer numPagninas) {
        this.numPagninas = numPagninas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagninas=" + numPagninas +
                '}';
    }
}