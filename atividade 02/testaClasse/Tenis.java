public class Tenis {
    private String marca;
    private String cor;
    private boolean desamarrado;

    public void status() {
        System.out.println("Cadarço: " + marca);
        System.out.println("Cor: " + cor);

        if (desamarrado == true) {
            System.out.println("Tênis desamarrado");
        } else {
            System.out.println("Tênis amarrado.");
        }
    }

    public Tenis(String cor, String marca) {
        setCadarco(marca);
        setSola(cor);
        desamarrado = true;
    }

    public String getCadarco() {
        return marca;
    }

    public void setCadarco(String marca) {
        this.marca = marca;
    }

    public String getSola() {
        return cor;
    }

    public void setSola(String cor) {
        this.cor = cor;
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
