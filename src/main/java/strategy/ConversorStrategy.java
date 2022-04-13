package strategy;

public interface ConversorStrategy {

   Integer getBase();

   String converter(int numero);

   String getConversorStrategy();

   int converterToBase10(String numero);

}
