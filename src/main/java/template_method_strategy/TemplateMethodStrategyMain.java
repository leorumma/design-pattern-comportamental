package template_method_strategy;

public class TemplateMethodStrategyMain {

    public static void main(String[] args) {
        ConversorTemplate conversorTemplate = new ConversorBinario();
        conversorTemplate.iniciarConversao(10, "11111");
    }

}
