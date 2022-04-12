package template_method_strategy;

public interface ConversorStrategy {

    Integer getBase();

    String converter(int numero);

    String quemSouEu();

    int converterToBase10(String numero);

}
