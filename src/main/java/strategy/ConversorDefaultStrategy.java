package strategy;

public abstract class ConversorDefaultStrategy implements ConversorStrategy{

    public abstract Integer getBase();

    @Override
    public int converterToBase10(String numero) {
        return Integer.parseInt(numero, getBase());
    }

}
