package Strategy;

public class HexaConversorStrategy implements ConversorStrategy {

    @Override
    public String converter(int numero) {
        return Integer.toHexString(numero);
    }
}
