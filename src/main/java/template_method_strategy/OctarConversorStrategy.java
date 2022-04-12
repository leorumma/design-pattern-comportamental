package template_method_strategy;

public class OctarConversorStrategy extends ConversorDefaultStrategy {
    @Override
    public String converter(int numero) {
        return "0" + Integer.toOctalString(numero).toUpperCase();
    }

    @Override
    public String quemSouEu() {
        return OctarConversorStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 8;
    }
}
