package template_method_strategy;

public class ConversorOctaStrategy extends ConversorDefaultStrategy {
    @Override
    public String converter(int numero) {
        return "0" + Integer.toOctalString(numero).toUpperCase();
    }

    @Override
    public String quemSouEu() {
        return ConversorOctaStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 8;
    }
}
