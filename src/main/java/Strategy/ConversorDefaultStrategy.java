package Strategy;

public abstract class ConversorDefaultStrategy implements ConversorStrategy{

    public abstract Integer getBase();

    @Override
    public int desconverter(String numeroConvertido) {
        return Integer.parseInt(numeroConvertido, getBase());
    }

}
