package Strategy;

public class ConversorBinarioStrategy implements ConversorStrategy {

    private final Integer base = 2;

    @Override
    public String converter(int number) {
        return Integer.toBinaryString(number);
    }

    @Override
    public String quemSouEu() {
        return ConversorBinarioStrategy.class.getSimpleName();
    }

    @Override
    public int desconverter(String numeroConvertido, int base) {
        return Integer.parseInt(numeroConvertido, base);
    }


}
