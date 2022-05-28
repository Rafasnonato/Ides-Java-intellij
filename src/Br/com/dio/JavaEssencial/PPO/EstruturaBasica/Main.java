package Br.com.dio.JavaEssencial.PPO.EstruturaBasica;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setModelo("Bmw serie 3");
        carro1.setCor("preta");
        carro1.setCapacidadeTanque(59);

        System.out.println("\nCarro 01 ");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade tanque: " +carro1.getCapacidadeTanque());
        System.out.println("Valor total do tanque: " + carro1.calculaValorTanque(7.29));

        System.out.println("\nCarro 02 ");
        Carro carro2 = new Carro("Mercedes-Benz Classe C", "Branca" , 66);

        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade tanque: " +carro2.getCapacidadeTanque());
        System.out.println("Valor total do tanque: " + carro2.calculaValorTanque(7.29));




    }
}
