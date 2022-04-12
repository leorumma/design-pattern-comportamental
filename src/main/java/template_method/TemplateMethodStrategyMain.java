package template_method;

public class TemplateMethodStrategyMain {

    public static void main(String[] args) {
        ConversorTemplate conversorBinario = new ConversorBinario();
        conversorBinario.iniciarConversao(10, "11111");

        ConversorTemplate conversorHexa = new ConversorHexa();
        conversorHexa.iniciarConversao(10, "FFEA");

        ConversorTemplate conversorOcta = new ConversorOcta();
        conversorOcta.iniciarConversao(10, "27642");
    }

}
