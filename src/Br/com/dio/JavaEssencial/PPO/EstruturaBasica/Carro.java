package Br.com.dio.JavaEssencial.PPO.EstruturaBasica;

public class Carro {
    private String modelo;
    private String cor;
    private int capacidadeTanque;

    public Carro() {
    }

    public Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double calculaValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }




}
