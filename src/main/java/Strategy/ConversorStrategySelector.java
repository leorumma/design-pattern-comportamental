package Strategy;

public class ConversorStrategySelector {

    public static ConversorStrategy getStrategy(ConversorTipo conversorTipo) throws Exception {

        if (conversorTipo.equals(ConversorTipo.BINARIO)) {
            return new ConversorBinarioStrategy();
        }
        if (conversorTipo.equals(ConversorTipo.HEXA)) {
            return new HexaConversorStrategy();
        }
        if (conversorTipo.equals(ConversorTipo.OCTA)) {
            return new OctaConversorStrategy();
        }
        throw new Exception("Nenhuma Strategy Definida");
    }

}
