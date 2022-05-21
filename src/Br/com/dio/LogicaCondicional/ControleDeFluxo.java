package Br.com.dio.LogicaCondicional;

public class ControleDeFluxo {

    public static void main(String[] args) {

        ifAno();
        ifFeriasComInt();
        ifFeriasComString();
        ifOpcao();

        switchFerias();
        switchDiaDaSemana();
        switchOpcao();

    }

    private static void ifAno() {
        int mes = 1;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mes invalido");
        }
    }

    private static void ifFeriasComInt() {
        int mes = 1;

        if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Ferias");
        } else {
            System.out.println("Ano letivo");
        }
    }

    private static void ifFeriasComString() {
        String mes1 = "junho";

        if (mes1 == "janeiro" || mes1 == "julho" || mes1 == "dezembro") {
            System.out.println("Ferias");
        } else {
            System.out.println("Ano letivo");
        }
    }

    private static void ifOpcao(){
        int opcao=4;
        if (opcao >= 1 && opcao <=3){
            System.out.println("certo");
        }else if (opcao==4){
            System.out.println("errado");
        }else if (opcao == 5){
            System.out.println("talvez");
        }else {
            System.out.println("opcao invalida");
        }
    }

    private static void switchFerias(){
        String mes = "julho";
        switch (mes){
            case "janeiro":
            case "julho":
            case "dezembro":
                System.out.println("Ferias");
                break;
            case "fevereiro":
            case "abril":
            case "maio":
            case "junho":
            case "agosto":
            case "setembro":
            case "outubro":
            case "novembro":
                System.out.println("Ano letivo");
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }

    }

    private static void switchDiaDaSemana() {
        String diaDaSemana = "Domingo";

        switch (diaDaSemana) {
            case "Domingo":
                System.out.println("Dia 1");
                break;
            case "Segunda":
                System.out.println("Dia 2");
                break;
            case "Terca":
                System.out.println("Dia 3");
                break;
            case "Quarta":
                System.out.println("Dia 4");
                break;
            case "Quinta":
                System.out.println("Dia 5");
                break;
            case "Sexta":
                System.out.println("Dia 6");
                break;
            case "Sabado":
                System.out.println("Dia 7");
                break;
            default:
                System.out.println("Dia da semana invalido");
                break;
        }
    }

    private static void switchOpcao() {
        int opção = 2;
        switch (opção) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Opçao invalida");
                break;
        }

    }


}
