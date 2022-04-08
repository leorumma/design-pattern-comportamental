package strategy;

public class HexaConversorStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int numero) {
        return "0x" + Integer.toHexString(numero).toUpperCase();
    }

    @Override
    public String quemSouEu() {
        return HexaConversorStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 16;
    }
}
