package Br.com.dio.JavaEssencial.PPO.Heranca1;

public class Main {
    public static void main(String[] args) {

        //Upcast
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        //DownCast geralmente da uma exception
        //Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}
