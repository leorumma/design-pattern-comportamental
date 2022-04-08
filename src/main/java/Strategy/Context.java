package Strategy;

public class Context {

    private final ConversorStrategy conversorStrategy;

    public Context(ConversorStrategy conversorStrategy) {
        this.conversorStrategy = conversorStrategy;
    }

    public String converter(int numero) {
        return conversorStrategy.converter(numero);
    }
}
