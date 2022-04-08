package templateMethod;

public class CasaVidroTemplate extends CasaTemplate {

    @Override
    public void construirParedes() {
        System.out.println("Construindo paredes de vidro");
    }

    @Override
    public void construirPilares() {
        System.out.println("Construindo com pilares com revestimento de vidro");
    }
}
