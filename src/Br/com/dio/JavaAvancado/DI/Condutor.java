package Br.com.dio.JavaAvancado.DI;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Carro());
        condutor.automovel();

        Condutor condutor1 = new Condutor(new Moto());
        condutor1.automovel();
    }


    private Veiculo veiculo;

    public Condutor(Veiculo obj){
        this.veiculo = obj;
    }
    public  void automovel(){
        veiculo.acao();
    }
}
