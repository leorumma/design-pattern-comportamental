package strategy;

import java.util.Scanner;

public class StrategyMain {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base(HEXA, OCTA, BINARIO)\n" +
                "Digite um numero nessa base para ser convertido para decimal\n" +
                "Digite um numero na base decimal para ser convertido para essa base");

        ConversorTipo tipo = ConversorTipo.valueOf(in.nextLine());
        String numeroToBase10 = in.nextLine();
        int numeroParaConverter = in.nextInt();


        System.out.println("Iniciando a Conversão");
        System.out.println("Conversor Escolhido " + ConversorStrategySelector.getStrategy(tipo).getConversorStrategy());
        System.out.println("Convertendo " + numeroParaConverter +
                " para a base " + ConversorStrategySelector.getStrategy(tipo).getBase() +
                " resultou " + ConversorStrategySelector.getStrategy(tipo).converter(numeroParaConverter));
        System.out.println("Convertendo o " + numeroToBase10 + " na base " + ConversorStrategySelector.getStrategy(tipo).getBase() +
                " para a base 10 resultou " + ConversorStrategySelector.getStrategy(tipo).converterToBase10(numeroToBase10));


    }

}
