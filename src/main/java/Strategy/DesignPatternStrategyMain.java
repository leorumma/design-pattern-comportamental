package Strategy;

public class DesignPatternStrategyMain {

    public static void main(String[] args) {
        Context context = new Context(new HexaConversorStrategy());
        System.out.println(context.converter(10));
    }

}
