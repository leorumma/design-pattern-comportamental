package TemplateMethod;

public abstract class CasaTemplate {

    public final void construirCasa() {
        construirFundacao();
        construirPilares();
        construirParedes();
        construirJanelas();
        System.out.println("casa construída!");
    }

    private void construirFundacao() {
        System.out.println("Fundação padrão");
    }

    private void construirJanelas() {
        System.out.println("Janela de vidro");
    }

    public abstract void construirParedes();

    public abstract void construirPilares();


}
