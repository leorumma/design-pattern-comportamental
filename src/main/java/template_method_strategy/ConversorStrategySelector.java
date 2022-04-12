package template_method_strategy;

public class ConversorStrategySelector {

    public static ConversorStrategy getStrategy(ConversorTipo conversorTipo) throws Exception {

        if (conversorTipo.equals(ConversorTipo.BINARIO)) {
            return new BinarioConversorStrategy();
        }
        if (conversorTipo.equals(ConversorTipo.HEXA)) {
            return new HexaConversorStrategy();
        }
        if (conversorTipo.equals(ConversorTipo.OCTA)) {
            return new OctarConversorStrategy();
        }
        throw new Exception("Nenhuma Strategy Definida");
    }

}
