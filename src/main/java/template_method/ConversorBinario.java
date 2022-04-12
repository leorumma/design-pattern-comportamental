package template_method;

public class ConversorBinario extends ConversorTemplate {

    @Override
    public String converter(int number) {
        return Integer.toBinaryString(number) + "b";
    }

    @Override
    public String getTipoConversor() {
        return ConversorBinario.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 2;
    }
}
