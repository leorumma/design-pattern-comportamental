package template_method;

public class ConversorOcta extends ConversorTemplate {

    @Override
    public String converter(int numero) {
        return "0" + Integer.toOctalString(numero).toUpperCase();
    }

    @Override
    public String getTipoConversor() {
        return ConversorOcta.class.getSimpleName();
    }

    @Override
    public Integer getBase() {
        return 8;
    }
}
