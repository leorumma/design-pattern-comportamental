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

        String numeroConvertido = ConversorStrategySelector.getStrategy(tipo).converter(numeroParaConverter);
        System.out.println("Numero Convertido " + numeroConvertido);

        System.out.println("o numero " + numeroToBase10 + " Para o padrão default decimal eh " + ConversorStrategySelector.getStrategy(tipo).converterToBase10(numeroToBase10));



    }

}
