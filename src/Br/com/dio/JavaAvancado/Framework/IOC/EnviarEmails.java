package Br.com.dio.JavaAvancado.Framework.IOC;

public class EnviarEmails {

    public EnviarEmails(String tipo,String endereco, String senha){
    }

    public static EnviarEmails obterDadosEmail(){
        return new EnviarEmails("Stmp","contato@email.com","senha");
    }

    public void retornar(String mensagem)   {
        System.out.println("E-mail enviado");
    }
}
