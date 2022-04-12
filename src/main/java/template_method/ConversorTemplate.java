package template_method;

public abstract class ConversorTemplate {

    public final void iniciarConversao(int numero, String numeroToBase10) {
        System.out.println("#################################");
        System.out.println("Iniciando a Conversão");
        System.out.println("Conversor Escolhido " + getTipoConversor());
        System.out.println("Convertendo " + numero + " para a base " + getBase() + " resultou " + converter(numero));
        System.out.println("Convertendo o " + numeroToBase10 + " na base " + getBase() + " para a base 10 resultou " + converterToBase10(numeroToBase10));
        System.out.println("Conversão finalizada");
        System.out.println("#################################");
    }

    public abstract String converter(int numero);

    public abstract String getTipoConversor();

    public abstract Integer getBase();

    private int converterToBase10(String numero) {
        return Integer.parseInt(numero, getBase());
    }

}
