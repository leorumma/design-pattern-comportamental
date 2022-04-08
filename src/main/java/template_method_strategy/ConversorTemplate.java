package template_method_strategy;

public abstract class ConversorTemplate {

    public final void iniciarConversao(int numero, String numeroToBase10) {
        System.out.println("Iniciando a Conversão");
        System.out.println("Conversor Escolhido " + quemSouEu());
        converter(numero);
        converterToBase10(numeroToBase10);
    }

    public abstract String converter(int numero);

    public abstract String quemSouEu();

    public abstract Integer getBase();

    private int converterToBase10(String numero) {
        return Integer.parseInt(numero, getBase());
    }

}
