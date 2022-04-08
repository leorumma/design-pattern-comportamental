package Strategy;

public class OctaConversorStrategy extends ConversorDefaultStrategy {

    @Override
    public String converter(int numero) {
       return "0" + Integer.toOctalString(numero).toUpperCase();
    }

    @Override
    public String quemSouEu() {
        return OctaConversorStrategy.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 8;
    }
}
