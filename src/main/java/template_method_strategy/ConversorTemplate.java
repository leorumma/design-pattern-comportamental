package template_method_strategy;

public class ConversorTemplate {

    public static void iniciarConversao(int numero, String numeroToBase10, ConversorTipo conversorTipo) throws Exception {
        System.out.println("#################################");
        System.out.println("Iniciando a Conversão");
        System.out.println("Conversor Escolhido " + ConversorStrategySelector.getStrategy(conversorTipo).quemSouEu());
        System.out.println("Convertendo " + numero +
                " para a base " + ConversorStrategySelector.getStrategy(conversorTipo).getBase() +
                " resultou " + ConversorStrategySelector.getStrategy(conversorTipo).converter(numero));
        System.out.println("Convertendo o " + numeroToBase10 +
                " na base " + ConversorStrategySelector.getStrategy(conversorTipo).getBase() +
                " para a base 10 resultou " + ConversorStrategySelector.getStrategy(conversorTipo).converterToBase10(numeroToBase10));
        System.out.println("Conversão finalizada");
        System.out.println("#################################");
    }

}
