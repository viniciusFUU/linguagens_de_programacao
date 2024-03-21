public class Tenis {
    private String cadarco;
    private String sola;
    private boolean desamarrado;

    public void status() {
        System.out.println("Cadarço: " + cadarco);
        System.out.println("Sola: " + sola);

        if (desamarrado == true) {
            System.out.println("Tênis desamarrado");
        } else {
            System.out.println("Tênis amarrado.");
        }
    }

    public Tenis(String sola, String cadarco) {
        setCadarco(cadarco);
        setSola(sola);
        desamarrado = true;
    }

    public String getCadarco() {
        return cadarco;
    }

    public void setCadarco(String cadarco) {
        this.cadarco = cadarco;
    }

    public String getSola() {
        return sola;
    }

    public void setSola(String sola) {
        this.sola = sola;
    }

    public boolean isDesamarrado() {
        return desamarrado;
    }

    public void setDesamarrado(boolean d) {
        this.desamarrado = d;
    }

    public void calcar() {
        if (desamarrado) {
            System.out.println("Pode calçar!");
        } else {
            System.out.println("Tenis já está calçado");
        }
    }

    public void amarrar() {
        this.desamarrado = false;
    }

    public void desamarrar() {
        this.desamarrado = true;
    }

}
