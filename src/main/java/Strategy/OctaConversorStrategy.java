package Strategy;

public class OctaConversorStrategy implements ConversorStrategy {

    private final Integer base = 8;

    @Override
    public String converter(int numero) {
       return Integer.toOctalString(numero);
    }

    @Override
    public String quemSouEu() {
        return OctaConversorStrategy.class.getSimpleName();
    }

    @Override
    public int desconverter(String numeroConvertido, int base) {
        return Integer.parseInt(numeroConvertido, base);
    }
}
