public class Headset {
    private boolean som;
    private String marca;
    private String cor;

    public void status(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
    }

    public Headset(String cor, String marca){
        setCor(cor);
        setMarca(marca);
        this.som = false;
    }
    
    //Objetos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    //Métodos
    public void ligar(){
        System.out.println("Ligando...");
        this.som = true;
        System.out.println("Ligado.");
    }

    public void desligar(){
        System.out.println("Desligando...");
        this.som = false;
        System.out.println("Desligado.");        
    }

    public void tocando(){
        if (this.som == true){
            System.out.println("Tocando");
        } else {
            System.out.println("Não está tocando.");
        }
    }
    
}
