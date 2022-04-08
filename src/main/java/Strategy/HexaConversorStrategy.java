package Strategy;

public class HexaConversorStrategy implements ConversorStrategy {

    private final Integer base = 16;

    @Override
    public String converter(int numero) {
        return Integer.toHexString(numero);
    }

    @Override
    public String quemSouEu() {
        return HexaConversorStrategy.class.getSimpleName();
    }

    @Override
    public int desconverter(String numeroConvertido, int base) {
        return Integer.parseInt(numeroConvertido, base);
    }
}
