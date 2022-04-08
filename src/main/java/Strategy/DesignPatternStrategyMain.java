package Strategy;

public class DesignPatternStrategyMain {

    public static void main(String[] args) throws Exception {
        ConversorStrategy conversorStrategy = ConversorStrategySelector.getStrategy(ConversorTipo.CONVERSOR_HEXA);
        System.out.println(conversorStrategy.converter(10));
        System.out.println(conversorStrategy.quemSouEu());

    }

}
