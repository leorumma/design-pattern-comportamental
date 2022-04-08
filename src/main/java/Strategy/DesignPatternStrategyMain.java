package Strategy;

import java.util.Scanner;

public class DesignPatternStrategyMain {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        ConversorTipo tipo = ConversorTipo.valueOf(in.nextLine());

        String numeroParaDesconverter = in.nextLine();

        int numeroParaConverter = in.nextInt();


        System.out.println("Iniciando a Conversão");
        ConversorStrategy conversorStrategy = ConversorStrategySelector.getStrategy(tipo);
        System.out.println("Conversor Escolhido " + conversorStrategy.quemSouEu());

        String numeroConvertido = conversorStrategy.converter(numeroParaConverter);
        System.out.println("Numero Convertido " + numeroConvertido.toUpperCase());

        System.out.println("Desconvertendo o numero " + numeroParaDesconverter + " Para o padrão default decimal");
        System.out.println(conversorStrategy.desconverter(numeroParaDesconverter));


    }

}
