package template_method_strategy;

public class BinarioConversorStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int numero) {
        return Integer.toBinaryString(numero) + "b";
    }

    @Override
    public String quemSouEu() {
        return BinarioConversorStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 2;
    }
}
