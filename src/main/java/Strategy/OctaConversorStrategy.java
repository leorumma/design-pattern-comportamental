package Strategy;

public class OctaConversorStrategy implements ConversorStrategy {
    @Override
    public String converter(int numero) {
       return Integer.toOctalString(numero);
    }
}
