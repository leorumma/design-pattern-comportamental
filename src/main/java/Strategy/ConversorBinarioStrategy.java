package Strategy;

public class ConversorBinarioStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int number) {
        return Integer.toBinaryString(number).toUpperCase() + "b";
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
