package template_method;

public class ConversorHexa extends ConversorTemplate {

    @Override
    public String converter(int numero) {
        return "0x" + Integer.toHexString(numero).toUpperCase();
    }

    @Override
    public String getTipoConversor() {
        return ConversorHexa.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 16;
    }

}
