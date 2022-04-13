package strategy;

public class ConversorBinarioStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int number) {
        return Integer.toBinaryString(number) + "b";
    }

    @Override
    public String getConversorStrategy() {
        return ConversorBinarioStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 2;
    }

}
