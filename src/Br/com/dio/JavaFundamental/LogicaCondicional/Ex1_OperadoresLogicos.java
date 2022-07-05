package Br.com.dio.JavaFundamental.LogicaCondicional;

public class Ex1_OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1=true , b2 = false , b3 = true , b4 = false;
        //so da true se ambos forem true
        System.out.println(" B1 && b2 " + (b1 && b2));
        System.out.println(" B1 && b3 " + (b1 && b3));

        //so da false se ambos forem false
        System.out.println(" B2 || b3 " + (b2 || b3));
        System.out.println(" B2 || b4 " + (b2 || b4));

        //Quando eles são iguais da false, e so da true quando forem diferentes
        System.out.println(" B1 ^ b3 " + (b1 ^ b3));
        System.out.println(" B4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10, i2=5;
        float f1=20f, f2 = 50f;
        System.out.println("((i1 + i2) < (f2-f1)) && true " + (((i1 + i2) < (f2-f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d, mediaSalario = 10500d, salarioMensal1 = 8000d;
        int qntDependentes = 4, mediaDependentes = 2;

        System.out.println((salarioMensal<mediaSalario)&& ( qntDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = qntDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean receberAuxilio= (salarioBaixo) && (muitosDependentes);
        System.out.println( "Receber auxilio " + receberAuxilio);

        boolean salarioBaixo1 = salarioMensal1 < mediaSalario;
        boolean muitosDependentes1 = qntDependentes >= mediaDependentes;

        boolean receberAuxilio1= (salarioBaixo1) && (muitosDependentes1);
        System.out.println( "Receber auxilio " + receberAuxilio1);



    }
}
