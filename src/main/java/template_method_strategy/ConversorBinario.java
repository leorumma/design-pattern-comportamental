package template_method_strategy;

import strategy.ConversorBinarioStrategy;

public class ConversorBinario extends ConversorTemplate {

    @Override
    public String converter(int number) {
        return Integer.toBinaryString(number) + "b";
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
