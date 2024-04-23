public class Tenis {
    private String marca;
    private String cor;
    private String cano;

    public void status() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Cano: " + cano);        
    }

    public Tenis(String marca, String cor, String cano) {
        setMarca(marca);
        setCor(cor);
        setCano(cano);
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

    public String getCano(){
        return cano;
    }

    public void setCano(String cano){
        this.cano = cano;
    }

    public void calcar() {
            System.out.println("Tenis calçado.");
    }

    public void amarrar() {
        System.out.println("Tenis amarrado.");
    }

    public void desamarrar() {
        System.out.println("Tenis desamarrado.");
    }

}
