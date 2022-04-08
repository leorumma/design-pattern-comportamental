package Strategy;

public class ConversorBinarioStrategy implements ConversorStrategy {

    @Override
    public String converter(int number) {
        return Integer.toBinaryString(number);
    }
}
