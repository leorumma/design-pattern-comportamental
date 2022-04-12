package template_method_strategy;

public class ConversorHexaStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int numero) {
        return "0x" + Integer.toHexString(numero).toUpperCase();
    }

    @Override
    public String quemSouEu() {
        return ConversorHexaStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 16;
    }
}
