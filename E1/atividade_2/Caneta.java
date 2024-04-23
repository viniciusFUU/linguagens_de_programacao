public class Caneta {
    private String marca;
    private String cor;
    private String tinta;

    public void status(){
        System.out.println("Caneta de cor " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Tem tinta? " + tinta);
    }

    public Caneta(String m, String c, String t){
        setCor(c);
        setMarca(m);
        setTinta(t);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    } 

    public String getMarca(){
        return marca;
    }

    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getTinta(){
        return tinta;
    }

    public void setTinta(String t){
        this.tinta = t;
    }

    // Métodos
    public void escrever(){
            System.out.println("Escrevendo...");
    }

    public void tampar(){
        System.out.println("Caneta tampada.");
    }

    public void destampar(){
        System.out.println("Caneta destampada.");
    }
}
