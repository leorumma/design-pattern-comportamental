package TemplateMethod;

public class DesignPatternTemplateMethodMain {

    public static void main(String[] args) {
        CasaTemplate casaTemplate = new CasaMadeiraTemplate();
        casaTemplate.construirCasa();

        casaTemplate = new CasaVidroTemplate();
        casaTemplate.construirCasa();

    }

}
