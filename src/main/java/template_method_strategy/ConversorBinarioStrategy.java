package template_method_strategy;

public class ConversorBinarioStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int numero) {
        return Integer.toBinaryString(numero) + "b";
    }

    @Override
    public String quemSouEu() {
        return ConversorBinarioStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 2;
    }
}
