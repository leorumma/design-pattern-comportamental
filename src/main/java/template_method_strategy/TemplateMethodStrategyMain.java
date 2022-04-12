package template_method_strategy;

import java.util.Scanner;

public class TemplateMethodStrategyMain {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base(HEXA, OCTA, BINARIO)\n" +
                "Digite um numero nessa base para ser convertido para decimal\n" +
                "Digite um numero na base decimal para ser convertido para essa base");

        ConversorTipo tipo = ConversorTipo.valueOf(in.nextLine());
        String numeroToBase10 = in.nextLine();
        int numeroParaConverter = in.nextInt();

        ConversorTemplate.iniciarConversao(numeroParaConverter, numeroToBase10, tipo);
    }

}
