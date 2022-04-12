package template_method_strategy;

public class ConversorStrategySelector {

    public static ConversorStrategy getStrategy(ConversorTipo conversorTipo) throws Exception {

        if (conversorTipo.equals(ConversorTipo.BINARIO)) {
            return new ConversorBinarioStrategy();
        }
        if (conversorTipo.equals(ConversorTipo.HEXA)) {
            return new ConversorHexaStrategy();
        }
        if (conversorTipo.equals(ConversorTipo.OCTA)) {
            return new ConversorOctaStrategy();
        }
        throw new Exception("Nenhuma Strategy Definida");
    }

}
