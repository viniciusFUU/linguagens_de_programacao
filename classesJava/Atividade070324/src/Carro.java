public class Carro {
    private String modelo;
    private String cor;
    private boolean ligado;    

    public void status(){
        System.out.println("O modelo do carro é " + modelo);
        System.out.println("A cor do carro é " + cor);
    }

    //Construtor
    public Carro(String m, String c){
        setModelo(m);
        setCor(c);
        this.ligado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = true;
    }
    
    //Métodos 
    public void ligar(){
        if (ligado != true){
            System.out.println("Ligando o carro...");
            ligado = true;
        } else {
            System.out.println("O carro está ligado!");
        }
    }

    public void desligar(){
        System.out.println("Desligando...");
        ligado = false;
        System.out.println("Carro desligado");
    }

    public void trancar(){
        if (!ligado){
            System.out.println("Trancando...");
            System.out.println("Trancado!");
        } else {
            System.out.println("O carro está ligado, não pode ser tracado");
        }
    }
}