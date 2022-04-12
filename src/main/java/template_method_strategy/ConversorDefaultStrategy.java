package template_method_strategy;

public abstract class ConversorDefaultStrategy implements ConversorStrategy {

    @Override
    public int converterToBase10(String numero) {
        return Integer.parseInt(numero, getBase());
    }

}
