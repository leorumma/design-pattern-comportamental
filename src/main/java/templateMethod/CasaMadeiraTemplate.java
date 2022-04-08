package templateMethod;

public class CasaMadeiraTemplate extends CasaTemplate {

    @Override
    public void construirParedes() {
        System.out.println("Construindo paredes de madeira");
    }

    @Override
    public void construirPilares() {
        System.out.println("Pilares com revestimento de madeira");
    }
}
