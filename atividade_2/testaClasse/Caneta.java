public class Caneta {
    private boolean tinta;
    private String marca;
    private String cor;

    public void status(){
        System.out.println("Caneta de cor " + cor);
        System.out.println("Marca " + marca);
    }

    public Caneta(String m, String c){
        setCor(c);
        setMarca(m);
        tinta = true;
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
    
    public boolean isTinta(){
        return tinta;
    }

    public void setTinta(boolean tinta) {
        this.tinta = tinta;
    }

    // Métodos
    public void escrever(){
        if (tinta == true){
            System.out.println("Tem tinta, então podemos escrever!");
            System.out.println("Escrevemos demais, a tinta acabou.");
            tinta = false;
        } else {
            System.out.println("não podemos escrever, estamos sem tinta :C");
        }
    }

    public void tampar(){
        System.out.println("Caneta tampada.");
    }

    public void destampar(){
        System.out.println("Caneta destampada.");
    }
}
